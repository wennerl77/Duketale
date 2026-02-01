package com.servidor.duketale.view.parts;

import com.servidor.duketale.view.Scenarios;

public class JDoor extends Part{

    private Scenarios targetScenario;
    
    public JDoor() {
        super();
    }

    public JDoor(Scenarios targetScenario) {
        this.targetScenario = targetScenario;
    }

    public Scenarios getTargetScenario() {
        return targetScenario;
    }

    public void setTargetScenario(Scenarios targetScenario) {
        this.targetScenario = targetScenario;
    }
}
