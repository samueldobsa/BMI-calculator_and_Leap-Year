package org.example;

public class LeapYear {
    public static void main(String[] args) {

        int year = 1900;
        boolean isLeap = year % 4 == 0;

        if (isLeap) {
            System.out.println("Prestupny rok: " + year);
        } else {
            System.out.println("Neni prestupny: " + year);
        }
    }
}
