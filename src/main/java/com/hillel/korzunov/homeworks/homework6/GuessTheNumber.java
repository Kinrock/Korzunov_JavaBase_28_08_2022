package com.hillel.korzunov.homeworks.homework6;

import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int mystery = (int) (Math.random() * 11);
        int answer;
        int a = 3;
        System.out.println("Try to guess the number from 0 to 10 that computer guessed.\nYou have "+ a + " attempts, lets start: ");
        for (int i = 1; i < 4; i++) {
            a--;
            if (scan.hasNextInt()) {
                answer = scan.nextInt();
            } else {
                System.out.println("Wrong data! Please, enter only integers from 0 to 10.");
                scan.nextLine();
                i--;
                a++;
                System.out.println("You have " + a + " attempts.");
                continue;
            }
            scan.nextLine();
            if (answer < 0 || answer > 10) {
                System.out.println("Please, enter number from 0 to 10");
                i--;
                a++;

            } else if (answer > mystery) {
                System.out.println("Your answer is more than guessed number.");

            } else if (answer < mystery) {
                System.out.println("Your answer is less than guessed number.");

            } else {
                System.out.println("You won!\nCongrats!");
                break;
            }
            System.out.println("You have " + a + " attempts.");
            if (a == 0) {
                System.out.println("Sorry, you loose. Better luck next time;)");
            }

        }
    }
}
