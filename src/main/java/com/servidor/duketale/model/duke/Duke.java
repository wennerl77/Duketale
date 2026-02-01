package com.servidor.duketale.model.duke;

import com.servidor.duketale.model.HitBox;
import com.servidor.duketale.model.Sprite;
import java.awt.Point;

public class Duke {
    private HitBox hitbox;
    private Sprite sprite;
    private Point position;
    private final int velocity = 20;

    public Duke(Sprite sprite, HitBox hitbox) {
        this.sprite = sprite;
        this.hitbox = hitbox;
        this.position = new Point(hitbox.getPoint());
    }
    
    public int x() {
        return position.x;
    }
    public int y() {
        return position.y;
    }
    public int width() {
        return hitbox.getSize().width;
    }
    public int height() {
        return hitbox.getSize().height;
    }

    public HitBox getHitbox() {
        return hitbox;
    }

    public Point getPosition() {
        return position;
    }

    public void setPosition(Point position) {
        this.position = position;
    }

    public int getVelocity() {
        return velocity;
    }
    
    public void right() {
        position.x++;
    }
    
    public void left() {
        position.x--;
    }
    
    public void up() {
        position.y--;
    }
    public void down() {
        position.y++;
    }
}
