package com.servidor.duketale.view;

import com.servidor.duketale.model.duke.Duke;
import com.servidor.duketale.model.HitBox;
import com.servidor.duketale.model.Parts;
import com.servidor.duketale.model.Sprite;
import com.servidor.duketale.model.duke.DukeSprites;
import com.servidor.duketale.view.parts.JDoor;
import com.servidor.duketale.view.parts.JWall;
import com.servidor.duketale.view.parts.Part;
import com.servidor.duketale.view.scenarios.JP1;
import com.servidor.duketale.view.scenarios.JP2;
import com.servidor.duketale.view.scenarios.Scenario;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.Timer;

public class JPJogo extends JPanel {

    protected Duke duke;
    private final JFMain jFMain;
    private final Map<String, String> KEY_BIND;
    private volatile Set<Integer> keysPressed;
    private final int TEMP = 5;
    private volatile int qtd = 0;
    private Timer walk;

    public JPJogo() {
        this.jFMain = null;
        this.KEY_BIND = null;
    }

    private CardLayout layout;

    // Scenarios of the game
    private JP1 jp1 = new JP1();
    private JP2 jp2 = new JP2();

    private Scenario active;

    public JPJogo(JFMain jFMain) {
        initComponents();

        KEY_BIND = new HashMap<>();
        initKeyBinds();
        keysPressed = new HashSet<>();
        this.jFMain = jFMain;

        this.layout = new CardLayout();
        this.setLayout(layout);

        this.add(Scenarios.SC1.getName(), jp1);
        this.add(Scenarios.SC2.getName(), jp2);
        transaction.setVisible(false);

        goToSC1();
    }

    private void goToSC1() {
        this.layout.show(this, Scenarios.SC1.getName());
        active = this.jp1;
    }

    private void goToSC2() {
        this.layout.show(this, Scenarios.SC2.getName());
        active = this.jp2;
    }

    public final void initGame() {
        this.duke = new Duke(new Sprite(DukeSprites.FRONT_IDLE,
                new Dimension(19, 26)),
                new HitBox(active.getLblJogador().getLocation(), active.getLblJogador().getSize(), Parts.DUKE));

        KEY_BIND.forEach((k, v) -> {
            this.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                    .put(KeyStroke.getKeyStroke(k), v);

            this.getActionMap().put(v, new AbstractAction() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    switch (v) {
                        case "p up" -> {
                            keysPressed.add(KeyEvent.VK_W);
                        }
                        case "r up" -> {
                            keysPressed.remove(KeyEvent.VK_W);
                            active.getLblJogador().setIcon(new ImageIcon(DukeSprites.BACK_IDLE.getUrl()));
                        }
                        case "p left" -> {
                            keysPressed.add(KeyEvent.VK_A);
                        }
                        case "r left" -> {
                            keysPressed.remove(KeyEvent.VK_A);
                            active.getLblJogador().setIcon(new ImageIcon(DukeSprites.LEFT_IDLE.getUrl()));
                        }
                        case "p down" -> {
                            keysPressed.add(KeyEvent.VK_S);
                            
                        }
                        case "r down" -> {
                            keysPressed.remove(KeyEvent.VK_S);
                            active.getLblJogador().setIcon(new ImageIcon(DukeSprites.FRONT_IDLE.getUrl()));
                        }
                        case "p right" -> {
                            keysPressed.add(KeyEvent.VK_D);
                        }
                        case "r right" -> {
                            keysPressed.remove(KeyEvent.VK_D);
                            active.getLblJogador().setIcon(new ImageIcon(DukeSprites.RIGHT_IDLE.getUrl()));
                        }
                    }
                }
            });
        });

        new Thread(() -> {
            while (true) {
                if (!keysPressed.isEmpty()) {
                    Point p = (Point) duke.getPosition().clone();
                    if (keysPressed.contains(KeyEvent.VK_W)) {
                        duke.up();
                        active.getLblJogador().setIcon(new ImageIcon(DukeSprites.BACK_WALK.getUrl()));
                    }
                    if (keysPressed.contains(KeyEvent.VK_A)) {
                        duke.left();
                        active.getLblJogador().setIcon(new ImageIcon(DukeSprites.LEFT_WALK.getUrl()));
                    }
                    if (keysPressed.contains(KeyEvent.VK_S)) {
                        duke.down();
                        active.getLblJogador().setIcon(new ImageIcon(DukeSprites.FRONT_WALK.getUrl()));
                    }
                    if (keysPressed.contains(KeyEvent.VK_D)) {
                        duke.right();
                        active.getLblJogador().setIcon(new ImageIcon(DukeSprites.RIGHT_WALK.getUrl()));
                    }

                    active.getList().forEach(part -> {
                        if (part instanceof JWall wall) {
                            if (dukeCollided(wall)) {
                                System.out.println("Colisao " + wall.getName());
                                duke.setPosition(p);
                                return;
                            }
                        }
                        if (part instanceof JDoor door) {
                            if (dukeCollided(door)) {
                                System.out.println("Porta");
                                transaction.setBackground(new Color(0, 0, 0, 0));
                                transaction.setVisible(true);
                                active.getLblJogador().setVisible(false);
                                for (int i = 0; i < 100; i++) {
                                    transaction.setBackground(new Color(0, 0, 0, i));
                                    try {
                                        Thread.sleep(6);
                                    } catch (InterruptedException ex) {
                                        Logger.getLogger(JPJogo.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                }
                                transaction.setVisible(false);
                                switch (door.getName()) {
                                    case "porta1" -> {
                                        goToSC1();
                                    }
                                    case "porta2" -> {
                                        goToSC2();
                                    }
                                }
                                transaction.setVisible(false);
                                active.getLblJogador().setVisible(true);
                                duke.setPosition(active.getPointSpawn());
                                this.revalidate();
                                this.repaint();
                            }
                        }
                    });
                    EventQueue.invokeLater(() -> {
                        updateDuke(p);
                    });
                    try {
                        Thread.sleep(TEMP);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(JPJogo.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }).start();
    }

    private boolean dukeCollided(Part wall) {
        return duke.x() + duke.width() > wall.getX()
                && duke.x() < wall.getX() + wall.getHitbox().getSize().width
                && duke.y() + duke.height() > wall.getY()
                && duke.y() < wall.getY() + wall.getHitbox().getSize().height;

    }

    private void initKeyBinds() {
        KEY_BIND.put("pressed W", "p up");
        KEY_BIND.put("released W", "r up");
        KEY_BIND.put("pressed A", "p left");
        KEY_BIND.put("released A", "r left");
        KEY_BIND.put("pressed S", "p down");
        KEY_BIND.put("released S", "r down");
        KEY_BIND.put("pressed D", "p right");
        KEY_BIND.put("released D", "r right");
    }

    private void updateDuke(Point past) {
//        Point newPoint = duke.getPosition();
//
//        int x = 0, y = 0;
//        if (newPoint.x > past.x) {
//            x = 1;
//        } else if (newPoint.x < past.x) {
//            x = -1;
//        }
//        if (newPoint.y > past.y) {
//            y = 1;
//        } else if (newPoint.y < past.y) {
//            y = -1;
//        }
//        
//        final int qtdX = x, qtdY = y;
//        
//        walk = new Timer(TEMP / duke.getVelocity(), (e) -> {
//            duke.setPosition(past);
//            past.x += qtdX;
//            past.y += qtdY;
//            active.getLblJogador().setLocation(duke.getPosition().x, duke.getPosition().y);
//            qtd++;
//        });
//        
//        walk.start();
        active.getLblJogador().setLocation(duke.getPosition().x, duke.getPosition().y);
        this.revalidate();
        this.repaint();
        this.jFMain.revalidate();
        this.jFMain.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        transaction = new javax.swing.JPanel();

        setLayout(null);

        transaction.setBackground(new java.awt.Color(0, 0, 0));
        add(transaction);
        transaction.setBounds(0, 0, 1300, 700);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel transaction;
    // End of variables declaration//GEN-END:variables
}
