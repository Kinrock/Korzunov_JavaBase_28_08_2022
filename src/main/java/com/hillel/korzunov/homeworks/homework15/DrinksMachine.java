package com.hillel.korzunov.homeworks.homework15;

public enum DrinksMachine {

    COFFEE("кава"),
    TEA("чай"),
    LEMONADE("лимонад"),
    MOJITO("мохіто"),
    MINERAL_WATER("мінералка"),
    COCA_COLA("кока-кола");


    private final String title;

    DrinksMachine(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
