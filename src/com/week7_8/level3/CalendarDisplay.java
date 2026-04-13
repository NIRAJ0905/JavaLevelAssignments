package com.week7_8.level3;

import java.util.Scanner;

public class CalendarDisplay {

    static String[] months = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
    static int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};

    public static boolean isLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    public static int firstDay(int m, int y) {
        int d = 1;
        if (m < 3) {
            m += 12;
            y--;
        }
        int k = y % 100;
        int j = y / 100;
        int f = d + (13*(m+1))/5 + k + k/4 + j/4 + 5*j;
        return f % 7;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month and year: ");
        int m = sc.nextInt();
        int y = sc.nextInt();

        if (m == 2 && isLeap(y)) days[1] = 29;

        System.out.println("\n   " + months[m-1] + " " + y);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        int start = firstDay(m, y);

        for (int i = 0; i < start; i++) System.out.print("    ");

        for (int i = 1; i <= days[m-1]; i++) {
            System.out.printf("%3d ", i);
            if ((i + start) % 7 == 0) System.out.println();
        }

        sc.close();
    }
}