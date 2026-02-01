
package com.servidor.duketale.view;

public enum Windows {
    INICIAL("inicio"),
    JOGO("jogo"),
    TRANSICTION("transicao");
    
    private String value;

    private Windows(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
