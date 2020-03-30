package com.company;

public class Main {

    public static void main(String[] args) {

        printMegaBytesAndKiloBytes(2500);

    }

    public static void printMegaBytesAndKiloBytes (int KiloBytes) {

        if (KiloBytes < 0) {

            System.out.println("Invalid Value");
        } else {

            int a = KiloBytes % 1024;

            //int b = (KiloBytes - a) / 1024;

            int b = KiloBytes / 1024;

            System.out.println(KiloBytes + " KB = " + b + " MB and " + a + " KB" );

        }

    }
}
