package com.company;

public class Main {

    public static void main(String[] args) {

        boolean a = hasEqualSum(1,1,1);
        System.out.println(a);
        a = hasEqualSum(1,1,2);
        System.out.println(a);
        a = hasEqualSum(1,-1,0);
        System.out.println(a);

    }

    public static boolean hasEqualSum (int first, int second, int total) {

        if ((first + second) == total) {

            return true;
        } else {

            return false;
        }
    }
}
