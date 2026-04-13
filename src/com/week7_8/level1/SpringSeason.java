package com.week7_8.level1;
import java.util.Scanner;

public class SpringSeason {

    public boolean isSpring(int month, int day) {

        if ((month == 3 && day >= 20) ||
            (month == 4 || month == 5) ||
            (month == 6 && day <= 20)) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int month = input.nextInt();
        int day = input.nextInt();

        SpringSeason obj = new SpringSeason();

        if (obj.isSpring(month, day))
            System.out.println("Spring Season");
        else
            System.out.println("Not Spring");

        input.close();
    }
}