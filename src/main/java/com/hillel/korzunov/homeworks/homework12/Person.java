package com.hillel.korzunov.homeworks.homework12;

public class Person {
    private final String firstName;
    private final int day;
    private final int month;
    private final int year;
    private final String email;
    private final String phone;
    private String lastName;
    private int weight;
    private String pressure;
    private int steps;
    private final int age;

    public Person(String firstName, int day, int month, int year, String email, String phone, String lastName, int weight, String pressure, int steps) {
        this.firstName = firstName;
        this.day = day;
        this.month = month;
        this.year = year;
        this.email = email;
        this.phone = phone;
        this.lastName = lastName;
        this.weight = weight;
        this.pressure = pressure;
        this.steps = steps;
        age = 2020 - year;
    }

    public int getAge() {
        return age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getLastName() {
        return lastName;
    }

    public int getWeight() {
        return weight;
    }

    public String getPressure() {
        return pressure;
    }

    public int getSteps() {
        return steps;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public String printAccountInfo() {
        return "Person " +
                "firstName = '" + firstName + '\'' +
                ", lastName = '" + lastName + '\'' +
                ", " + "\n" + day +
                "." + month +
                "." + year + ", age = " + getAge() +
                ", " + "\n" + "email = '" + email + '\'' +
                ", " + "\n" + "phone = '" + phone + '\'' +
                ", " + "\n" + "weight = " + weight +
                ", pressure = '" + pressure + '\'' +
                ", steps = " + steps + "." + "\n"
                ;
    }
}
