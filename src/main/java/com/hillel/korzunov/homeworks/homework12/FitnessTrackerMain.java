package com.hillel.korzunov.homeworks.homework12;

public class FitnessTrackerMain {
    public static void main(String[] args) {

        Person person1 = new Person("Nick", 5, 6, 1989, "korzunov.nikolay@gmail.com",
                "0937069169", "Korzunov", 90, "120/80", 10000);
        Person person2 = new Person("Elon", 28, 6, 1971, "elon.musk@gmail.com",
                "112358122032", "Musk", 87, "130/70", 15000);
        Person person3 = new Person("Victor", 21, 6, 1962, "vitbka.alive@gmail.com",
                "6-13-54", "Tsoy", 73, "105/65", 4000);
        Person person4 = new Person("Keanu", 2, 9, 1964, "reeves.keanu@gmail.com",
                "568338555722", "Reeves", 80, "115/76", 13000);
        Person person5 = new Person("Vlad", 14, 4, 1431, "prosto.vladik@gmail.com",
                "967854635314", "Drakula", 60, "250/130", 879000);

        System.out.println(person1.printAccountInfo());
        System.out.println(person2.printAccountInfo());
        System.out.println(person3.printAccountInfo());
        System.out.println(person4.printAccountInfo());
        System.out.println(person5.printAccountInfo());

        person1.setWeight(95);
        person1.steps = 8500;
        person3.setPressure("140/100");
        person3.lastName = "Tsoi";

        System.out.println("After changes: \n");
        System.out.println(person1.printAccountInfo());
        System.out.println(person3.printAccountInfo());

    }
}
