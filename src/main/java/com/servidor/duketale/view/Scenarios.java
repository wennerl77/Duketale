package com.servidor.duketale.view;

public enum Scenarios {
    SC1("cenario 1"),
    SC2("cenario 2");
    
    private String name;

    private Scenarios(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
