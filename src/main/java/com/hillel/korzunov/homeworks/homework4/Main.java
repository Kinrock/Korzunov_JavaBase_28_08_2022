package com.hillel.korzunov.homeworks.homework4;

public class Main {
    public static void main(String[] args) {
        final double COEFICIENT=1.5;
        int warriorLi = 13;
        int archerLi = 24;
        int riderLi = 46;
        int warriorMing = 9;
        int archerMing = 35;
        int riderMing = 12;
        int armyStrengthLi=860;
        double armyStrengthMing=armyStrengthLi*COEFICIENT;
        int attackRateLi=armyStrengthLi*(warriorLi+archerLi+riderLi);
        double attackRateMing=armyStrengthMing*(warriorMing+archerMing+riderMing);
        System.out.println("General attack of the Li Dynasty: "+attackRateLi+".");
        System.out.println("General attack of the Ming Dynasty: "+(int)attackRateMing+".");
    }
}
