package com.hillel.korzunov.homeworks.homeworks14;

public abstract class SmartphonesGeneral implements Smartphones {
    private final String name;
    private String model;

    protected SmartphonesGeneral(String name, String model) {
        this.name = name;
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    @Override
    public void sms() {
    }

    @Override
    public void call() {
    }

    @Override
    public void internet() {
    }
}
