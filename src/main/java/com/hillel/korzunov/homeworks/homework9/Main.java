package com.hillel.korzunov.homeworks.homework9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String mistake = "Wrong data! Please, enter only positive integers from 1 to 10";
        System.out.println("Enter two integers to configure your matrix: ");
        int m = 0;
        int n = 0;
        for (int i = 0; i < 1; i++) {
            if (scan.hasNextInt()) {
                m = scan.nextInt();
            } else {
                System.out.println(mistake);
                scan.nextLine();
                i--;
                continue;
            }
            scan.nextLine();
            if (m < 1 || m > 10) {
                System.out.println(mistake);
                i--;
            }
        }
        for (int i = 0; i < 1; i++) {
            if (scan.hasNextInt()) {
                n = scan.nextInt();
            } else {
                System.out.println(mistake);
                scan.nextLine();
                i--;
                continue;
            }
            scan.nextLine();
            if (n < 1 || n > 10) {
                System.out.println(mistake);
                i--;
            }
        }
        int counter = 1;
        int[][] array = new int[m][n];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = counter;
                counter++;
            }
        }
        System.out.println("The matrix before transposition: ");
        for (int[] value : array) {
            for (int i : value) {
                System.out.print(i + "\t");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        int[][] transArray = new int[n][m];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int temp = array[i][j];
                transArray[j][i] = array[i][j];
                array[i][j] = temp;
            }
        }
        System.out.println("The matrix after transposition: ");
        for (int[] ints : transArray) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }
    }
}
