package com.hillel.korzunov.homeworks.homework16;

public class ArraysUtil {
    public static double getAverageOfArraysElements(int[] array) {
        double averageValue;
        int sum = 0;
        if (array == null || array.length == 0) {
            return 0.0;
        }
        for (int j : array) {
            sum += j;
        }
        averageValue = (double) sum / array.length;
        return averageValue;
    }

    public static boolean isTwoDimArraySquare(int[][] array) {
        double check = 0;
        if (array == null || array.length == 0) {
            return false;
        }

        for (int[] ints : array) {
            if (ints == null || ints.length == 0) {
                return false;
            }
            check += ints.length;
        }

        check = check / (double) array.length;
        return check == array.length;
    }

}
