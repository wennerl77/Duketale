package com.servidor.duketale.view.scenarios;
import com.servidor.duketale.view.parts.Part;
import java.awt.Point;
import java.util.List;
import javax.swing.JLabel;

public interface Scenario {
    public JLabel getLblJogador();
    public List<Part> getList();
    public Point getPointSpawn();
}
