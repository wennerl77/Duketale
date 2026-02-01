package com.servidor.duketale.view;

import java.awt.CardLayout;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JFMain extends JFrame {
    
    // Cuida de agrupar e exibir as telas
    private final CardLayout layout;
    private final JPanel mainPanel;

    // Tamanho da janela principal
    private final Dimension size;
    
    // Paineis
    private JPinicial inicial;
    private JPJogo jogo;
    
    public JFMain() {
        this.size = new Dimension(1300, 700);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(this.size);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        
        this.layout = new CardLayout();
        this.mainPanel = new JPanel(layout);
        
        // Instanciacao dos paineis
        this.inicial = new JPinicial(this);
        this.jogo = new JPJogo(this);
        
        // Adicionando paineis ao painel principal
        this.mainPanel.add(Windows.INICIAL.getValue(), inicial);
        this.mainPanel.add(Windows.JOGO.getValue(), jogo);
        
        this.add(mainPanel);
        
        goToInicial();
    }
    
    // Alteracao dos paineis exibidos
    public final void goToInicial() {
        layout.show(this.mainPanel, Windows.INICIAL.getValue());
        this.pack();
    }
    
    public final void goToJogo() {
        layout.show(this.mainPanel, Windows.JOGO.getValue());
        this.jogo.initGame();
        this.pack();
    }
}
