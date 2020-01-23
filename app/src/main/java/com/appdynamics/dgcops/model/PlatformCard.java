package com.appdynamics.dgcops.model;

public class PlatformCard {

    private String name;
    private String controllerHealth;
    private String esHealth;


    public PlatformCard() {}

    public PlatformCard(String name, String controllerHealth, String esHealth) {
        this.name = name;
        this.controllerHealth = controllerHealth;
        this.esHealth = esHealth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getControllerHealth() {
        return controllerHealth;
    }

    public void setControllerHealth(String controllerHealth) {
        this.controllerHealth = controllerHealth;
    }

    public String getEsHealth() {
        return esHealth;
    }

    public void setEsHealth(String esHealth) {
        this.esHealth = esHealth;
    }
}
