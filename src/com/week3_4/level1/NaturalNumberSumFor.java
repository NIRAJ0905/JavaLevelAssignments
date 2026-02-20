package com.week3_4.level1;
import java.util.Scanner;

public class NaturalNumberSumFor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = in.nextInt(), sum = 0;
        for (int i = 1; i <= n; i++) sum += i;
        System.out.println("Sum = " + sum);
        in.close();
    }
}