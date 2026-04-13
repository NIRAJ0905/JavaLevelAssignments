package com.week7_8.level2;

import java.util.Scanner;

public class LeapYear {

    public static boolean isLeap(int year) {
        return (year >= 1582) &&
               ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        if (isLeap(year))
            System.out.println("Leap Year");
        else
            System.out.println("Not Leap Year");

        sc.close();
    }
}