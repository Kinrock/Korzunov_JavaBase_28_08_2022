package com.hillel.korzunov.homeworks.homework12;

public class Person {
    private final String firstName;
    private final int dd;
    private final int mm;
    private final int yyyy;
    private final String email;
    private final String phone;
    String lastName;
    int weight;
    String pressure;
    int steps;
    private final int age;

    public Person(String firstName, int dd, int mm, int yyyy, String email, String phone, String lastName, int weight, String pressure, int steps) {
        this.firstName = firstName;
        this.dd = dd;
        this.mm = mm;
        this.yyyy = yyyy;
        this.email = email;
        this.phone = phone;
        this.lastName = lastName;
        this.weight = weight;
        this.pressure = pressure;
        this.steps = steps;
        age = 2020 - yyyy;
    }

    public int getAge() {
        return age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public String printAccountInfo() {
        return "Person " +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", " + "\n" + dd +
                "." + mm +
                "." + yyyy + ", age= " + getAge() +
                ", " + "\n" + "email='" + email + '\'' +
                ", " + "\n" + "phone='" + phone + '\'' +
                ", " + "\n" + "weight=" + weight +
                ", pressure='" + pressure + '\'' +
                ", steps=" + steps + "." + "\n"
                ;
    }
}
