package com.company;

public class Main {

    public static void main(String[] args) {

        boolean a = shouldWakeUp(true, 1);
        System.out.println(a);
        a = shouldWakeUp(false, 2);
        System.out.println(a);
        a = shouldWakeUp(true, 8);
        System.out.println(a);
        a = shouldWakeUp(true, -1);
        System.out.println(a);

    }

    public static boolean shouldWakeUp (boolean barking, int hourOfDay) {

        if (hourOfDay < 0 || hourOfDay > 23) {

            return false;
        } else if ( barking == true && (hourOfDay < 8 || hourOfDay > 22)) {

            return true;
        } else {

            return false;
        }
    }

}
