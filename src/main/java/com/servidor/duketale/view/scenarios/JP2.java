package com.servidor.duketale.view.scenarios;

import com.servidor.duketale.model.duke.DukeSprites;
import com.servidor.duketale.view.Scenarios;
import com.servidor.duketale.view.parts.Part;
import java.awt.Component;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JP2 extends JPanel implements Scenario {

    private List<Part> list;
    
    public JP2() {
        initComponents();
        lblPoint.setVisible(false);
        this.dJP.setTargetScenario(Scenarios.SC1);
        this.dJP3.setTargetScenario(Scenarios.SC1);
        lblJogador.setIcon(new ImageIcon(DukeSprites.FRONT_IDLE.getUrl()));
        
        list = new ArrayList<>();
        
        for (Component c : this.getComponents()) {
            if (c instanceof Part part) {
                list.add(part);
            }
        }
    }
    
    @Override
    public JLabel getLblJogador() {
        return lblJogador;
    }

    @Override
    public List<Part> getList() {
        return list;
    }
    
    @Override
    public Point getPointSpawn() {
        return lblPoint.getLocation();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblJogador = new javax.swing.JLabel();
        wCima = new com.servidor.duketale.view.parts.JWall();
        jWall2 = new com.servidor.duketale.view.parts.JWall();
        jWall3 = new com.servidor.duketale.view.parts.JWall();
        jWall4 = new com.servidor.duketale.view.parts.JWall();
        wCima6 = new com.servidor.duketale.view.parts.JWall();
        dJP3 = new com.servidor.duketale.view.parts.JDoor();
        wCima11 = new com.servidor.duketale.view.parts.JWall();
        dJP = new com.servidor.duketale.view.parts.JDoor();
        lblPoint = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 51, 51));
        setLayout(null);

        lblJogador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/duke/DKFRONT_IDLE.png"))); // NOI18N
        add(lblJogador);
        lblJogador.setBounds(470, 530, 40, 50);

        wCima.setBackground(new java.awt.Color(255, 0, 0));
        wCima.setName("cima"); // NOI18N

        javax.swing.GroupLayout wCimaLayout = new javax.swing.GroupLayout(wCima);
        wCima.setLayout(wCimaLayout);
        wCimaLayout.setHorizontalGroup(
            wCimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1300, Short.MAX_VALUE)
        );
        wCimaLayout.setVerticalGroup(
            wCimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        add(wCima);
        wCima.setBounds(0, 0, 1300, 60);

        jWall2.setBackground(new java.awt.Color(255, 0, 0));
        jWall2.setName("baixo"); // NOI18N

        javax.swing.GroupLayout jWall2Layout = new javax.swing.GroupLayout(jWall2);
        jWall2.setLayout(jWall2Layout);
        jWall2Layout.setHorizontalGroup(
            jWall2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1300, Short.MAX_VALUE)
        );
        jWall2Layout.setVerticalGroup(
            jWall2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        add(jWall2);
        jWall2.setBounds(0, 640, 1300, 60);

        jWall3.setBackground(new java.awt.Color(255, 0, 0));
        jWall3.setName("esquerda"); // NOI18N

        javax.swing.GroupLayout jWall3Layout = new javax.swing.GroupLayout(jWall3);
        jWall3.setLayout(jWall3Layout);
        jWall3Layout.setHorizontalGroup(
            jWall3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        jWall3Layout.setVerticalGroup(
            jWall3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );

        add(jWall3);
        jWall3.setBounds(0, 60, 60, 580);

        jWall4.setBackground(new java.awt.Color(255, 0, 0));
        jWall4.setName("direita"); // NOI18N

        javax.swing.GroupLayout jWall4Layout = new javax.swing.GroupLayout(jWall4);
        jWall4.setLayout(jWall4Layout);
        jWall4Layout.setHorizontalGroup(
            jWall4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        jWall4Layout.setVerticalGroup(
            jWall4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );

        add(jWall4);
        jWall4.setBounds(1240, 60, 60, 580);

        wCima6.setBackground(new java.awt.Color(255, 0, 0));
        wCima6.setName("cima"); // NOI18N

        javax.swing.GroupLayout wCima6Layout = new javax.swing.GroupLayout(wCima6);
        wCima6.setLayout(wCima6Layout);
        wCima6Layout.setHorizontalGroup(
            wCima6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );
        wCima6Layout.setVerticalGroup(
            wCima6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        add(wCima6);
        wCima6.setBounds(90, 430, 650, 60);

        dJP3.setBackground(new java.awt.Color(0, 255, 0));

        javax.swing.GroupLayout dJP3Layout = new javax.swing.GroupLayout(dJP3);
        dJP3.setLayout(dJP3Layout);
        dJP3Layout.setHorizontalGroup(
            dJP3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        dJP3Layout.setVerticalGroup(
            dJP3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        add(dJP3);
        dJP3.setBounds(1100, 130, 100, 100);

        wCima11.setBackground(new java.awt.Color(255, 0, 0));
        wCima11.setName("cima"); // NOI18N

        javax.swing.GroupLayout wCima11Layout = new javax.swing.GroupLayout(wCima11);
        wCima11.setLayout(wCima11Layout);
        wCima11Layout.setHorizontalGroup(
            wCima11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );
        wCima11Layout.setVerticalGroup(
            wCima11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        add(wCima11);
        wCima11.setBounds(590, 330, 650, 60);

        dJP.setBackground(new java.awt.Color(0, 255, 0));
        dJP.setName("porta1"); // NOI18N

        javax.swing.GroupLayout dJPLayout = new javax.swing.GroupLayout(dJP);
        dJP.setLayout(dJPLayout);
        dJPLayout.setHorizontalGroup(
            dJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        dJPLayout.setVerticalGroup(
            dJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        add(dJP);
        dJP.setBounds(90, 510, 100, 100);

        lblPoint.setText("Point Spawn");
        add(lblPoint);
        lblPoint.setBounds(260, 550, 70, 16);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.servidor.duketale.view.parts.JDoor dJP;
    private com.servidor.duketale.view.parts.JDoor dJP3;
    private com.servidor.duketale.view.parts.JWall jWall2;
    private com.servidor.duketale.view.parts.JWall jWall3;
    private com.servidor.duketale.view.parts.JWall jWall4;
    private javax.swing.JLabel lblJogador;
    private javax.swing.JLabel lblPoint;
    private com.servidor.duketale.view.parts.JWall wCima;
    private com.servidor.duketale.view.parts.JWall wCima11;
    private com.servidor.duketale.view.parts.JWall wCima6;
    // End of variables declaration//GEN-END:variables

    
}
