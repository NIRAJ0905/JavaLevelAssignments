package com.week3_4.level1;
import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = in.nextInt();
        System.out.print("Enter day (1-31): ");
        int day = in.nextInt();
        boolean spring = (month == 3 && day >= 20) ||
                         (month == 4 || month == 5) ||
                         (month == 6 && day <= 20);
        System.out.println("Is Spring season? " + spring);
        in.close();
    }
}