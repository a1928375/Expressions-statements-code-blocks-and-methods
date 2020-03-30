package com.company;

public class Main {

    public static void main(String[] args) {

        boolean a = hasTeen(9, 99, 19);
        System.out.println(a);
        a = hasTeen(23, 15, 42);
        System.out.println(a);
        a = hasTeen(22, 23, 34);
        System.out.println(a);
        a = isTeen(9);
        System.out.println(a);
        a = isTeen(13);
        System.out.println(a);
    }

    public static boolean hasTeen (int first, int second, int third) {

        if ((first >= 13 && first <= 19) || (second >= 13 && second <= 19) || (third >= 13 && third <= 19)) {

            return true;
        } else {

            return false;
        }
    }

    public static boolean isTeen (int age) {

        if (age >= 13 && age <= 19) {

            return true;
        } else {

            return false;
        }

    }

}
