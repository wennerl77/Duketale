package com.servidor.duketale.model;

import java.awt.Dimension;
import java.awt.Point;

public class HitBox {
    private Point point;
    private Dimension size;
    private Parts part;

    public HitBox(Point point, Dimension size, Parts part) {
        this.point = point;
        this.size = size;
        this.part = part;
    }
    
    public HitBox(int x, int y, Dimension size, Parts part) {
        this.point = new Point(x, y);
        this.size = size;
        this.part = part;
    }
    
    public HitBox(Point point, int width, int height, Parts part) {
        this.point = point;
        this.size = new Dimension(width, height);
        this.part = part;
    }
    
    public HitBox(int x, int y, int width, int height, Parts part) {
        this.point = new Point(x, y);
        this.size = new Dimension(width, height);
        this.part = part;
    }

    public Point getPoint() {
        return point;
    }

    public Dimension getSize() {
        return size;
    }

    public Parts getPart() {
        return part;
    }
}
