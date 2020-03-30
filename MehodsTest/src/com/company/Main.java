package com.company;

public class Main {

    public static void main(String[] args) {



        int score = calculation(1500);

        //System.out.println(score);
        display("Tina", score);

        score = calculation(900);

        display("Jenny", score);

        //System.out.println(score2);

        score = calculation(400);

        display("Lyn", score);

        //System.out.println(score3);

        score = calculation(50);

        display("Amy", score);

        //System.out.println(score4);
    }

    public static void display(String name, int highscore){

        System.out.println(name + " managed to get into " + highscore + " on the high score table");

    }

    public static int calculation(int score) {

        if (score >= 1000) {
            return 1;
        } else if (score >= 500 && 1000 > score) {
            return 2;
        } else if (score >= 100 && 500> score) {
            return 3;
        } else {
            return 4;
        }

    }
}
