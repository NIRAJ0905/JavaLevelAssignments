package com.week3_4.level1;
import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter numbers (0 to stop):");
        int n;
        while ((n = in.nextInt()) != 0) sum += n;
        System.out.println("Total sum = " + sum);
        in.close();
    }
}