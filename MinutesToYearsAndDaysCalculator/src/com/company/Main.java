package com.company;

public class Main {

    public static void main(String[] args) {

        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
        printYearsAndDays(0);

    }

    public static void printYearsAndDays (long minutes) {

        if (minutes < 0 ) {

            System.out.println("Invalid Value");
        } else {

            long years = 0;
            long days = minutes / (24*60);

            if (days >= 365) {

                years = days / 365;
            }

            days = days % (365);

            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }
    }
}
