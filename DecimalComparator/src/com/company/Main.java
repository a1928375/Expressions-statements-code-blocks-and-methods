package com.company;

public class Main {

    public static void main(String[] args) {

        boolean a = areEqualByThreeDecimalPlaces(-3.1756, -3.175);
        System.out.println(a);
        a = areEqualByThreeDecimalPlaces(3.175, -3.176);
        System.out.println(a);
        a = areEqualByThreeDecimalPlaces(3.0, 3.0);
        System.out.println(a);
        a = areEqualByThreeDecimalPlaces(-3.123, 3.123);
        System.out.println(a);
        a = areEqualByThreeDecimalPlaces(3.174, 3.175);
        System.out.println(a);

    }

    public static boolean areEqualByThreeDecimalPlaces (double first, double second) {

        float result = (float) (first - second);

        if (result == 0 || (result < 0.001 && result > -0.001 )) {

            System.out.println((first - second));
            return true;
        } else {

            return false;
        }

    }

}
