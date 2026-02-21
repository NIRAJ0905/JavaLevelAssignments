package com.week3_4.level3;
import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter month day year: ");
        int m = input.nextInt();
        int d = input.nextInt();
        int y = input.nextInt();

        int y0 = y - (14 - m) / 12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int day = (d + x + (31*m0)/12) % 7;

        System.out.println("Day of Week (0=Sunday): " + day);

        input.close();
    }
}