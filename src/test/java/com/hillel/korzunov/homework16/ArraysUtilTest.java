package com.hillel.korzunov.homework16;

import org.junit.jupiter.api.*;

import static com.hillel.korzunov.homeworks.homework16.ArraysUtil.*;
import static org.junit.jupiter.api.Assertions.*;

public class ArraysUtilTest {

    static int[] arrayTest;

    @BeforeAll
    static void beforeAll() {
        arrayTest = new int[]{6, 6, 6, 6, 6, 6};
    }

    @Test
    public void test1() {
        assertFalse(isTwoDimArraySquare(null));
    }

    @Test
    public void test2() {
        assertFalse(isTwoDimArraySquare(new int[0][0]));
    }

    @Test
    public void test3() {
        assertTrue(isTwoDimArraySquare(new int[6][6]));
    }

    @Test
    public void test4() {
        double average = getAverageOfArraysElements(new int[]{});
        assertEquals(0.0, average);
    }

    @Test
    public void test5() {
        double average = getAverageOfArraysElements(null);
        assertEquals(0.0, average);
    }

    @Test
    public void test6() {
        double average = getAverageOfArraysElements(arrayTest);
        assertEquals(6.0, average);
    }
}
