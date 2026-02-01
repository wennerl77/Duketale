package com.servidor.duketale.view.parts;

import com.servidor.duketale.model.HitBox;
import com.servidor.duketale.model.Parts;
import javax.swing.JPanel;

public class Part extends JPanel {
    
    protected HitBox hitbox;
    
    public Part() {
        super();
    }
    
    @Override
    public void setBounds(int x, int y, int width, int height) {
        super.setBounds(x, y, width, height);
        this.hitbox = new HitBox(x, y, width, height, Parts.WALL);
    }

    public HitBox getHitbox() {
        return hitbox;
    }
}
