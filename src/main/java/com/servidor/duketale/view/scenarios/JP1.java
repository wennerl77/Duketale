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

public class JP1 extends JPanel implements Scenario{

    private List<Part> list;
    
    public JP1() {
        initComponents();
        lblPoint.setVisible(false);
        this.dJP2.setTargetScenario(Scenarios.SC2);
        lblJogador.setIcon(new ImageIcon(DukeSprites.FRONT_IDLE.getUrl()));
        list = new ArrayList<>();
        
        for (Component c : this.getComponents()) {
            if (c instanceof Part part) {
                list.add(part);
            }
        }
        
        this.dJP2.setTargetScenario(Scenarios.SC2);
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
        wCima1 = new com.servidor.duketale.view.parts.JWall();
        wCima2 = new com.servidor.duketale.view.parts.JWall();
        wCima3 = new com.servidor.duketale.view.parts.JWall();
        wCima4 = new com.servidor.duketale.view.parts.JWall();
        wCima5 = new com.servidor.duketale.view.parts.JWall();
        wCima6 = new com.servidor.duketale.view.parts.JWall();
        wCima7 = new com.servidor.duketale.view.parts.JWall();
        wCima8 = new com.servidor.duketale.view.parts.JWall();
        wCima9 = new com.servidor.duketale.view.parts.JWall();
        wCima10 = new com.servidor.duketale.view.parts.JWall();
        dJP2 = new com.servidor.duketale.view.parts.JDoor();
        lblPoint = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 51, 51));
        setLayout(null);

        lblJogador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/duke/DKFRONT_IDLE.png"))); // NOI18N
        add(lblJogador);
        lblJogador.setBounds(340, 530, 40, 50);

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

        wCima1.setBackground(new java.awt.Color(255, 0, 0));
        wCima1.setName("cima"); // NOI18N

        javax.swing.GroupLayout wCima1Layout = new javax.swing.GroupLayout(wCima1);
        wCima1.setLayout(wCima1Layout);
        wCima1Layout.setHorizontalGroup(
            wCima1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 810, Short.MAX_VALUE)
        );
        wCima1Layout.setVerticalGroup(
            wCima1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        add(wCima1);
        wCima1.setBounds(50, 100, 810, 60);

        wCima2.setBackground(new java.awt.Color(255, 0, 0));
        wCima2.setName("cima"); // NOI18N

        javax.swing.GroupLayout wCima2Layout = new javax.swing.GroupLayout(wCima2);
        wCima2.setLayout(wCima2Layout);
        wCima2Layout.setHorizontalGroup(
            wCima2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        wCima2Layout.setVerticalGroup(
            wCima2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );

        add(wCima2);
        wCima2.setBounds(90, 160, 60, 220);

        wCima3.setBackground(new java.awt.Color(255, 0, 0));
        wCima3.setName("cima"); // NOI18N

        javax.swing.GroupLayout wCima3Layout = new javax.swing.GroupLayout(wCima3);
        wCima3.setLayout(wCima3Layout);
        wCima3Layout.setHorizontalGroup(
            wCima3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        wCima3Layout.setVerticalGroup(
            wCima3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );

        add(wCima3);
        wCima3.setBounds(210, 160, 60, 220);

        wCima4.setBackground(new java.awt.Color(255, 0, 0));
        wCima4.setName("cima"); // NOI18N

        javax.swing.GroupLayout wCima4Layout = new javax.swing.GroupLayout(wCima4);
        wCima4.setLayout(wCima4Layout);
        wCima4Layout.setHorizontalGroup(
            wCima4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        wCima4Layout.setVerticalGroup(
            wCima4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );

        add(wCima4);
        wCima4.setBounds(340, 220, 60, 160);

        wCima5.setBackground(new java.awt.Color(255, 0, 0));
        wCima5.setName("cima"); // NOI18N

        javax.swing.GroupLayout wCima5Layout = new javax.swing.GroupLayout(wCima5);
        wCima5.setLayout(wCima5Layout);
        wCima5Layout.setHorizontalGroup(
            wCima5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        wCima5Layout.setVerticalGroup(
            wCima5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );

        add(wCima5);
        wCima5.setBounds(460, 160, 60, 160);

        wCima6.setBackground(new java.awt.Color(255, 0, 0));
        wCima6.setName("cima"); // NOI18N

        javax.swing.GroupLayout wCima6Layout = new javax.swing.GroupLayout(wCima6);
        wCima6.setLayout(wCima6Layout);
        wCima6Layout.setHorizontalGroup(
            wCima6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );
        wCima6Layout.setVerticalGroup(
            wCima6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        add(wCima6);
        wCima6.setBounds(340, 380, 180, 60);

        wCima7.setBackground(new java.awt.Color(255, 0, 0));
        wCima7.setName("cima"); // NOI18N

        javax.swing.GroupLayout wCima7Layout = new javax.swing.GroupLayout(wCima7);
        wCima7.setLayout(wCima7Layout);
        wCima7Layout.setHorizontalGroup(
            wCima7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        wCima7Layout.setVerticalGroup(
            wCima7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );

        add(wCima7);
        wCima7.setBounds(460, 420, 60, 220);

        wCima8.setBackground(new java.awt.Color(255, 0, 0));
        wCima8.setName("cima"); // NOI18N

        javax.swing.GroupLayout wCima8Layout = new javax.swing.GroupLayout(wCima8);
        wCima8.setLayout(wCima8Layout);
        wCima8Layout.setHorizontalGroup(
            wCima8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        wCima8Layout.setVerticalGroup(
            wCima8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );

        add(wCima8);
        wCima8.setBounds(800, 160, 60, 420);

        wCima9.setBackground(new java.awt.Color(255, 0, 0));
        wCima9.setName("cima"); // NOI18N

        javax.swing.GroupLayout wCima9Layout = new javax.swing.GroupLayout(wCima9);
        wCima9.setLayout(wCima9Layout);
        wCima9Layout.setHorizontalGroup(
            wCima9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        wCima9Layout.setVerticalGroup(
            wCima9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );

        add(wCima9);
        wCima9.setBounds(590, 280, 60, 220);

        wCima10.setBackground(new java.awt.Color(255, 0, 0));
        wCima10.setName("cima"); // NOI18N

        javax.swing.GroupLayout wCima10Layout = new javax.swing.GroupLayout(wCima10);
        wCima10.setLayout(wCima10Layout);
        wCima10Layout.setHorizontalGroup(
            wCima10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        wCima10Layout.setVerticalGroup(
            wCima10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        add(wCima10);
        wCima10.setBounds(590, 550, 60, 60);

        dJP2.setBackground(new java.awt.Color(0, 255, 0));
        dJP2.setName("porta2"); // NOI18N

        javax.swing.GroupLayout dJP2Layout = new javax.swing.GroupLayout(dJP2);
        dJP2.setLayout(dJP2Layout);
        dJP2Layout.setHorizontalGroup(
            dJP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        dJP2Layout.setVerticalGroup(
            dJP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        add(dJP2);
        dJP2.setBounds(90, 510, 100, 100);

        lblPoint.setText("Point spawn");
        add(lblPoint);
        lblPoint.setBounds(240, 550, 70, 16);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.servidor.duketale.view.parts.JDoor dJP2;
    private com.servidor.duketale.view.parts.JWall jWall2;
    private com.servidor.duketale.view.parts.JWall jWall3;
    private com.servidor.duketale.view.parts.JWall jWall4;
    private javax.swing.JLabel lblJogador;
    private javax.swing.JLabel lblPoint;
    private com.servidor.duketale.view.parts.JWall wCima;
    private com.servidor.duketale.view.parts.JWall wCima1;
    private com.servidor.duketale.view.parts.JWall wCima10;
    private com.servidor.duketale.view.parts.JWall wCima2;
    private com.servidor.duketale.view.parts.JWall wCima3;
    private com.servidor.duketale.view.parts.JWall wCima4;
    private com.servidor.duketale.view.parts.JWall wCima5;
    private com.servidor.duketale.view.parts.JWall wCima6;
    private com.servidor.duketale.view.parts.JWall wCima7;
    private com.servidor.duketale.view.parts.JWall wCima8;
    private com.servidor.duketale.view.parts.JWall wCima9;
    // End of variables declaration//GEN-END:variables


}
