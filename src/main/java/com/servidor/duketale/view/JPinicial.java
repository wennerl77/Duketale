package com.servidor.duketale.view;


import javax.swing.JOptionPane;

public class JPinicial extends javax.swing.JPanel {
    
    private final JFMain jFMain;
    
    public JPinicial(JFMain jFMain) {
        initComponents();
        this.jFMain = jFMain;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnQuit = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        lblBackground = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnQuit.setText("Quit");
        btnQuit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitActionPerformed(evt);
            }
        });
        add(btnQuit, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 470, 830, 110));

        jButton2.setText("New Game");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 830, 110));

        jButton3.setText("Configurations");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, 830, 110));

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inicial/principal.png"))); // NOI18N
        lblBackground.setToolTipText("");
        add(lblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 700));
    }// </editor-fold>//GEN-END:initComponents

    private void btnQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitActionPerformed
        int op = JOptionPane.showConfirmDialog(this, "Deseja sair", "Confirm Dialog", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (op == JOptionPane.YES_OPTION) {
            this.jFMain.dispose();
            System.exit(0);
        }
    }//GEN-LAST:event_btnQuitActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.jFMain.goToJogo();
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnQuit;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel lblBackground;
    // End of variables declaration//GEN-END:variables
}
