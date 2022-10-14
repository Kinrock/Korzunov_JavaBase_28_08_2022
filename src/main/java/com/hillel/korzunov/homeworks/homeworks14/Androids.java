package com.hillel.korzunov.homeworks.homeworks14;

public class Androids extends SmartphonesGeneral implements Smartphones, LinuxOS {
    protected Androids(String name, String model) {
        super(name, model);
    }

    @Override
    public void sms() {
        System.out.println("Phone name " + '\u0022' + getName() + '\u0022' + ", model " +
                '\u0022' + getModel() + '\u0022' + " is sending sms...");
    }

    @Override
    public void call() {
        System.out.println("Phone name " + '\u0022' + getName() + '\u0022' + ", model " +
                '\u0022' + getModel() + '\u0022' + " is calling...");
    }

    @Override
    public void internet() {
        System.out.println("Phone name " + '\u0022' + getName() + '\u0022' + ", model " +
                '\u0022' + getModel() + '\u0022' + " is using internet...");
    }

    @Override
    public void systemRun() {
        System.out.println("Phone name " + '\u0022' + getName() + '\u0022' + ", model "+
                '\u0022' + getModel() + '\u0022' + " runs on Linux operating system.");
    }
}
