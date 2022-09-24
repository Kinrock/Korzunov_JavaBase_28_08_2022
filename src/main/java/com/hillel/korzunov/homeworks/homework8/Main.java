package com.hillel.korzunov.homeworks.homework8;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int a = 7;
        int[] hiddenNumbers = new int[a];
        int[] guessedNumbers = new int[a];
        for (int i = 0; i < hiddenNumbers.length; i++) {
            hiddenNumbers[i] = (int) (Math.random() * 10);
            guessedNumbers[i] = (int) (Math.random() * 10);
        }
        Arrays.sort(hiddenNumbers);
        Arrays.sort(guessedNumbers);
        System.out.println(Arrays.toString(hiddenNumbers));
        System.out.println(Arrays.toString(guessedNumbers));
        int coincidence = 0;
        int indexMisMatch = Arrays.mismatch(hiddenNumbers, guessedNumbers);
        if (indexMisMatch == -1) {
            System.out.println("The player guessed all the numbers, unbelievable!\nCongrats!");
            System.exit(0);
        }
        for (int i = 0; i < hiddenNumbers.length; i++) {
            if (hiddenNumbers[i] == guessedNumbers[i]) {
                coincidence++;
                System.out.println("The player guessed the number under the number " + i +
                        ", guessed number is " + guessedNumbers[i] + ".");
            }
        }
        if (coincidence == 0) {
            System.out.println("Sorry, the player did not guess a single number. \nBetter luck next time!");
        } else {
            System.out.println("Total amount of coincidences is " + coincidence + ".");
        }
    }
}
