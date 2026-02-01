package com.servidor.duketale.model;

import com.servidor.duketale.model.duke.DukeSprites;
import java.awt.Dimension;

public class Sprite {
    private DukeSprites sprite;
    private Dimension spriteSize;

    public Sprite(DukeSprites sprite, Dimension spriteSize) {
        this.sprite = sprite;
        this.spriteSize = spriteSize;
    }
}
