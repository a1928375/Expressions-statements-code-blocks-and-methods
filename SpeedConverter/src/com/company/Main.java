package com.company;

public class Main {

    public static void main(String[] args) {

        long a = toMilesPerHour(1.5);
        System.out.println(a);

        printConversion(1.5);

    }

    public static long toMilesPerHour (double kilometersPerHour) {

        if (kilometersPerHour < 0) {
            return -1;
        } else {
            return Math.round(kilometersPerHour/1.609);
        }
    }

    public static void printConversion (double kilometersPerHour) {

        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");;
        } else {
            long b = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + b + " mi/h");
        }
    }
}
