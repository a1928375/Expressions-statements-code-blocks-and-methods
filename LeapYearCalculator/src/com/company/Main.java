package com.company;

public class Main {

    public static void main(String[] args) {

        boolean a = isLeapYear(-1600);
        System.out.println(a);
        a = isLeapYear(1600);
        System.out.println(a);
        a = isLeapYear(2017);
        System.out.println(a);
        a = isLeapYear(2000);
        System.out.println(a);
        a = isLeapYear(2100);
        System.out.println(a);

    }

    public static boolean isLeapYear (int year) {

        if (year < 1 || year > 9999) {

            return false;
        } else if (year % 400 == 0) {

            return true;
        } else if (year % 100 == 0) {

            return false;
        } else if (year % 4 == 0) {

            return true;
        } else {

            return false;
        }

    }

}
