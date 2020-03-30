package com.company;

public class Main {

    public static void main(String[] args) {

        double a = calcFeetAandInchesToCentimeters(5, 11);
        //System.out.println(a);
        a = calcFeetAandInchesToCentimeters(88);
        //System.out.println(a);
        }

    public static double calcFeetAandInchesToCentimeters (double feet, double inches) {

        if (feet < 0 || inches < 0 || inches > 12) {

            return -1;
        } else {

            double result = (feet*12 + inches)*2.54;

            System.out.println(feet + " feet " + inches + " inches = " + result + " cm" );
            return result;
        }
    }

    public static double calcFeetAandInchesToCentimeters (double inches) {

        if (inches < 0) {

            return -1;
        } else {

            double feet =  (int) inches/12;
            double remainingInches = inches % 12;
            System.out.println(inches + " inches is equal to " + feet + " feet and remaining " + remainingInches + " inches" );
            return calcFeetAandInchesToCentimeters(feet, remainingInches);
        }

    }

}