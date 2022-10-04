package com.hillel.korzunov.homeworks.homework11;

public class Burger {
    String burgerBun;
    String burgerMeat;
    String burgerCheese;
    String burgerGreens;
    String burgerMayonnaise;
    boolean isDouble;


    public Burger(String burgerBun, String burgerMeat, String burgerCheese, String burgerGreens) {
        this.burgerBun = burgerBun;
        this.burgerMeat = burgerMeat;
        this.burgerCheese = burgerCheese;
        this.burgerGreens = burgerGreens;
        System.out.println("Burger contains " + burgerBun + ", " + burgerMeat + ", " + burgerCheese + ", " + burgerGreens + ". Mayonnaise free.");
    }

    public Burger(String burgerBun, String burgerMeat, String burgerCheese, String burgerGreens, String burgerMayonnaise) {
        this.burgerBun = burgerBun;
        this.burgerMeat = burgerMeat;
        this.burgerCheese = burgerCheese;
        this.burgerGreens = burgerGreens;
        this.burgerMayonnaise = burgerMayonnaise;
        System.out.println("Burger contains " + burgerBun + ", " + burgerMeat + ", " + burgerCheese + ", " + burgerGreens + ", " + burgerMayonnaise + ".");
    }

    public Burger(String burgerBun, boolean isDouble, String burgerMeat, String burgerCheese, String burgerGreens, String burgerMayonnaise) {
        this.burgerBun = burgerBun;
        this.burgerCheese = burgerCheese;
        this.burgerGreens = burgerGreens;
        this.burgerMayonnaise = burgerMayonnaise;
        this.isDouble = isDouble;
        String doubleMeat="double meat";
        if (this.isDouble) {
            this.burgerMeat = doubleMeat;
            System.out.println("Burger contains " + burgerBun + ", " + doubleMeat + ", " + burgerCheese + ", " + burgerGreens + ", " + burgerMayonnaise + ".");

        } else {
            this.burgerMeat=burgerMeat;
            System.out.println("Burger contains " + burgerBun + ", " + burgerMeat + ", " + burgerCheese + ", " + burgerGreens + ", " + burgerMayonnaise + ".");

        }
    }
}
