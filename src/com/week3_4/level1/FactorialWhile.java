package com.week3_4.level1;
import java.util.Scanner;

public class FactorialWhile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = in.nextInt(), fact = 1, i = 1;
        while (i <= n) fact *= i++;
        System.out.println("Factorial of " + n + " = " + fact);
        in.close();
    }
}