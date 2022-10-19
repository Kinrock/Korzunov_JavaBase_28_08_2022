package com.hillel.korzunov.homeworks.homework15;

import java.util.Arrays;
import java.util.Scanner;

import static com.hillel.korzunov.homeworks.homework15.Drinks.*;

public class Main {
    public static void main(String[] args) {
        runDrinksMachine();
    }

    static void runDrinksMachine() {
        Scanner scan = new Scanner(System.in);
        DrinksMachine drinksMachine = null;
        DrinksMachine[] drinksMachines = DrinksMachine.values();
        int counter = 0;
        double totalPrice = 0.0;
        while (true) {
            System.out.println("���� �����, ������ ����: \n" + Arrays.toString(drinksMachines)
                    + "," + "\n��� �������� NO ��� ���������� ������������ ���������:");
            while (true) {
                String userValue = scan.nextLine().toUpperCase();
                if (userValue.equals("NO")) {
                    System.out.println("�������� ������� ������: " + totalPrice + ".");
                    System.out.println("ʳ������ ������������ �����: " + counter + ".");
                    System.exit(0);
                }
                for (DrinksMachine value : DrinksMachine.values()) {
                    if (userValue.equals(value.toString())) {
                        drinksMachine = DrinksMachine.valueOf(userValue);
                        break;
                    }
                }
                if (drinksMachine != null) {
                    break;
                } else {
                    System.out.println("�� ����� ����� ��������� �����, ���� �����, ������ ����� ����� ���, �� " +
                            "��������� � ������.");
                }
            }
            String message = "��� %s �������, ������� ����� %s.";
            switch (drinksMachine) {
                case COFFEE: {
                    coffeeMaker();
                    System.out.println(String.format(message, DrinksMachine.COFFEE.getTitle(), COFFEE_PRICE));
                    totalPrice += COFFEE_PRICE;
                    counter++;
                    break;
                }
                case TEA: {
                    teaMaker();
                    System.out.println(String.format(message, DrinksMachine.TEA.getTitle(), TEA_PRICE));
                    totalPrice += TEA_PRICE;
                    counter++;
                    break;
                }
                case LEMONADE: {
                    lemonadeMaker();
                    System.out.println(String.format(message, DrinksMachine.LEMONADE.getTitle(), LEMONADE_PRICE));
                    totalPrice += LEMONADE_PRICE;
                    counter++;
                    break;
                }
                case MOJITO: {
                    mojitoMaker();
                    System.out.println(String.format(message, DrinksMachine.MOJITO.getTitle(), MOJITO_PRICE));
                    totalPrice += MOJITO_PRICE;
                    counter++;
                    break;
                }
                case MINERAL_WATER: {
                    mineralWaterMaker();
                    System.out.println(String.format(message, DrinksMachine.MINERAL_WATER.getTitle(), MINERAL_WATER_PRICE));
                    totalPrice += MINERAL_WATER_PRICE;
                    counter++;
                    break;
                }
                case COCA_COLA: {
                    cocaColaMaker();
                    System.out.println(String.format(message, DrinksMachine.COCA_COLA.getTitle(), COCA_COLA_PRICE));
                    totalPrice += COCA_COLA_PRICE;
                    counter++;
                    break;
                }
            }
        }
    }

    static void coffeeMaker() {
        System.out.println("���� " + DrinksMachine.COFFEE.getTitle() + " ��������...");
    }

    static void teaMaker() {
        System.out.println("��� " + DrinksMachine.TEA.getTitle() + " ��������...");
    }

    static void lemonadeMaker() {
        System.out.println("��� " + DrinksMachine.LEMONADE.getTitle() + " ��������...");
    }

    static void mojitoMaker() {
        System.out.println("��� " + DrinksMachine.MOJITO.getTitle() + " ��������...");
    }

    static void mineralWaterMaker() {
        System.out.println("���� " + DrinksMachine.MINERAL_WATER.getTitle() + " ��������...");
    }

    static void cocaColaMaker() {
        System.out.println("���� " + DrinksMachine.COCA_COLA.getTitle() + " ��������...");
    }
}
