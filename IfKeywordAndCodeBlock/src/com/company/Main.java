package com.company;

public class Main {

    public static void main(String[] args) {

        int a = 5;

        if (a < 10) {
            System.out.println("a is less than 10");
        } else if (a < 5) {
            System.out.println("a is less than 5");
        } else {
            System.out.println("a");
        }

        boolean game = true;
        int score = 800;
        int level = 5;
        int bonus = 100;

        if (game) {
            int finalScore = score + (level * bonus);
            System.out.println("Final score was " + finalScore);
        }

//        if (game) {
//            int score2 = 10000;
//            int level2 = 8;
//            int bonus2 = 200;
//            int finalScore2 = score2 + (level2 * bonus2);
//            System.out.println("Final score was " + finalScore2);
//      }
//      => waste memory

        score = 10000;
        level = 8;
        bonus = 200;

        if (game) {
            int finalScore = score + (level*bonus);
            System.out.println("Final score was " + finalScore);
        }

    }
}
