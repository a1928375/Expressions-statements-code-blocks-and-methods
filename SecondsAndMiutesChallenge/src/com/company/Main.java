package com.company;

public class Main {

    private static final String INVALID = "Invalid Value";

    public static void main(String[] args) {

        String a = getDurationString(89, 56);
        System.out.println(a);

        a = getDurationString(556);
        System.out.println(a);

        a = getDurationString(-1);
        System.out.println(a);

        a = getDurationString(9, 6);
        System.out.println(a);

        a = getDurationString(16, 56);
        System.out.println(a);
    }

    public static String getDurationString (int minutes, int seconds) {

        if (minutes < 0 || seconds < 0 || seconds > 59) {

            return INVALID;
        } else {

            int hour = minutes / 60;
            int remainingMinutes = minutes % 60;

            String newHour = hour + "h ";
            String newRemainingMinutes = remainingMinutes + "m ";
            String newSeconds = seconds + "s";

            if (hour < 10) {

                newHour = "0" + newHour;
            }

            if (remainingMinutes < 10) {

                newRemainingMinutes = "0" + newRemainingMinutes;
            }

            if (seconds < 10) {

                newSeconds = "0" + newSeconds;
            }

            return (newHour + " " + newRemainingMinutes + " " + newSeconds);
        }
    }

    public static String getDurationString (int seconds) {

        if (seconds < 0) {

            return INVALID;
        } else {

            int minutes = seconds/60;
            int remainingSeconds = seconds%60;

            return getDurationString(minutes, remainingSeconds);

        }
    }

}
