package com.servidor.duketale.model.duke;

import java.net.URL;

public enum DukeSprites {
    FRONT_IDLE("/duke/DKFRONT_IDLE.png"),
    BACK_IDLE("/duke/DKBACK_IDLE.png"),
    LEFT_IDLE("/duke/DKLEFT_IDLE.png"),
    RIGHT_IDLE("/duke/DKRIGHT_IDLE.png"),
    FRONT_WALK("/duke/DKFRONT_WALK.gif"),
    BACK_WALK("/duke/DKBACK_WALK.gif"),
    RIGHT_WALK("/duke/DKRIGHT_WALK.gif"),
    LEFT_WALK("/duke/DKLEFT_WALK.gif");
    
    private String path;
    private URL url;

    private DukeSprites(String path) {
        this.path = path;
        this.url = getClass().getResource(path);
    }

    public URL getUrl() {
        return url;
    }
}
