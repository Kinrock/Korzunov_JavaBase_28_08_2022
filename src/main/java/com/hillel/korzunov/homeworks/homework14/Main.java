package com.hillel.korzunov.homeworks.homework14;

public class Main {
    public static void main(String[] args) {
        SmartphonesGeneral[] smartphones = {
                new Androids("Xiaomi", "RedMi note 13"),
                new IPhones("Apple", "13 X-styles"),
        };
        for (SmartphonesGeneral smartphone : smartphones) {
            if (smartphone != null) {
                smartphone.sms();
                smartphone.call();
                smartphone.internet();
                if (smartphone instanceof Androids) {
                    ((Androids) smartphone).systemRun();
                } else if (smartphone instanceof IPhones) {
                    ((IPhones) smartphone).systemRun();
                }
            }
        }
    }
}
