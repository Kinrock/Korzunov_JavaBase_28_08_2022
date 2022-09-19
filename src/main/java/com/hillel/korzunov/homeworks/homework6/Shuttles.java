package com.hillel.korzunov.homeworks.homework6;

public class Shuttles {
    public static void main(String[] args) {
        int counter = 0;
        for (int i = 1; true; i++) {
            if (i == 4 || i == 9 || i / 10 == 4 || i / 10 == 9 || i % 10 == 4 || i % 10 == 9 || (i / 10) % 10 == 4 || (i / 10) % 10 == 9) {
                continue;
            }
            System.out.println("Shuttle number: " + i);

            if (counter == 100) {
                break;
            }
            counter++;
        }
        System.out.println("Shuttle count: " + counter);
    }
}
