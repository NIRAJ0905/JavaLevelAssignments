package com.week3_4.level1;
import java.util.Scanner;

public class SumUntilZeroOrNegative {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0, n;
        System.out.println("Enter positive numbers (0/-ve to stop):");
        while (true) {
            n = in.nextInt();
            if (n <= 0) break;
            sum += n;
        }
        System.out.println("Sum = " + sum);
        in.close();
    }
}