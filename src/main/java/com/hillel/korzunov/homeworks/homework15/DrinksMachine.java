package com.hillel.korzunov.homeworks.homework15;

public enum DrinksMachine {

    COFFEE("����"),
    TEA("���"),
    LEMONADE("�������"),
    MOJITO("������"),
    MINERAL_WATER("��������"),
    COCA_COLA("����-����");


    private final String title;

    DrinksMachine(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
