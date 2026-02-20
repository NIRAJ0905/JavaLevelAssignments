package com.week3_4.level1;
import java.util.Scanner;

public class NaturalNumberSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = in.nextInt();
        if (n > 0)
            System.out.println("Sum of first " + n + " natural numbers = " + (n * (n + 1) / 2));
        else
            System.out.println("Not a natural number!");
        in.close();
    }
}