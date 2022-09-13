package com.hillel.korzunov.homeworks.homework5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] team1 = new int[5];
        int[] team2 = new int[5];
        String mistake = "Wrong data! Please restart app and try again.\nNotice: use only integers for frags.";
        System.out.println("Enter the name of the first team:");
        String teamName1 = scan.nextLine();
        System.out.println("Enter number of frags for each of your " + team1.length + " players:");
        for (int i = 0; i < team1.length; i++) {
            if (scan.hasNextInt()) {
                team1[i] = scan.nextInt();
            } else {
                System.out.println(mistake);
                System.exit(0);
            }
        }
        scan.nextLine();
        System.out.println("Enter the name of the second team: ");
        String teamName2 = scan.nextLine();
        System.out.println("Enter number of frags for each of your " + team2.length + " players:");
        for (int i = 0; i < team2.length; i++) {
            if (scan.hasNextInt()) {
                team2[i] = scan.nextInt();
            } else {
                System.out.println(mistake);
                System.exit(0);
            }
        }
        int result1 = 0;
        int result2 = 0;
        for (int m : team1) {
            result1 += m;
        }
        for (int n : team2) {
            result2 += n;
        }
        double averageTeam1 = (double) result1 / team1.length;
        double averageTeam2 = (double) result2 / team2.length;
        if (averageTeam1 > averageTeam2) {
            System.out.println("The " + teamName1 + " won! They scored " + averageTeam1 + " points.\nCongrats!");
        } else if (averageTeam1 < averageTeam2) {
            System.out.println("The " + teamName2 + " won! They scored " + averageTeam2 + " points.\nCongrats!");
        } else {
            System.out.println("Both teams scored the same number of points.\nDraw!");
        }
    }
}
