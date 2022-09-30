package com.hillel.korzunov.homeworks.homework10;

public class Person {
    public static void main(String[] args) {

        System.out.println(personInfo("Will","Smith", "New York", "9379992"));
        System.out.println(personInfo("Jackie","Chan", "Shanghai", "12312412412"));
        System.out.println(personInfo("Sherlock","Holmes", "London", "37742123513"));
    }
    static String personInfo(String firstName, String lastName, String city, String number) {
        return "Call to person "+firstName+" "+lastName+" from the "+city+" city"+" by phone number:"+number+".";
    }
}
