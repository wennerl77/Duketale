package com.servidor.duketale.view;

import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFMain jFMain = new JFMain();
        });
    }
}
