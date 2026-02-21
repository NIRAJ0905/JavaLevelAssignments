package com.week3_4.level3;
import java.util.Scanner;

public class AbundantNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = input.nextInt();
        int sum = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0)
                sum += i;
        }

        System.out.println(sum > number ?
            "Abundant Number" : "Not an Abundant Number");

        input.close();
    }
}