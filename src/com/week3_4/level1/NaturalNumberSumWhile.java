package com.week3_4.level1;
import java.util.Scanner;

public class NaturalNumberSumWhile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = in.nextInt(), i = 1, sum = 0;
        while (i <= n) sum += i++;
        System.out.println("Sum = " + sum);
        in.close();
    }
}