package com.company;

public class Main {

    public static void main(String[] args) {

        Calculatiuon(true, 800,5, 100);

        Calculatiuon(true, 10000, 8, 200);

        //System.out.println(Calculatiuon(true, 10000, 8, 200)); => 不能print出 void

        int score = Calculatiuon2(true, 800,5, 100);

        System.out.println("Final score was " + score);

        int score2 = Calculatiuon2(true, 10000, 8, 200);

        System.out.println("Final score was " + score2);

        //System.out.println(Calculatiuon2(true, 10000, 8, 200)); // => 能print出value
    }

    public static void Calculatiuon (boolean game, int score, int level, int bonus){

        if (game) {
            int finalScore = score + (level * bonus);
            System.out.println("Final score was " + finalScore);
        }

    }

    public static int Calculatiuon2 (boolean game, int score, int level, int bonus){

        if (game) {
            int finalScore = score + (level * bonus);
            //System.out.println("Final score was " + finalScore);
            return finalScore;
        }
        return -1;
    }

}
