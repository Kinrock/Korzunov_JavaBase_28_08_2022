package com.hillel.korzunov.homeworks.homework7;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] team1 = new int[25];
        int[] team2 = new int[25];

        double averageTeam1 = 0;
        double averageTeam2 = 0;

        for (int i = 0; i < team1.length; i++) {
            team1[i] = (int) ((Math.random() * 23) + 18);
        }
        for (int i = 0; i < team2.length; i++) {
            team2[i] = (int) ((Math.random() * 23) + 18);
        }

        System.out.println(Arrays.toString(team1));
        System.out.println(Arrays.toString(team2));

        for (int age : team1) {
            averageTeam1 += age;
        }
        for (int age : team2) {
            averageTeam2 += age;
        }

        averageTeam1 = averageTeam1 / team1.length;
        averageTeam2 = averageTeam2 / team2.length;

        System.out.println("Average age of the first team is " + (int) averageTeam1 + " years.");
        System.out.println("Average age of the second team is " + (int) averageTeam2 + " years.");

    }
}
