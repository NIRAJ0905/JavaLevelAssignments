package com.week5_6.level3;
import java.util.Scanner;
public class DigitFrequencyAdvanced {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int number = input.nextInt();
        if (number < 0) {
            System.out.println("Invalid Input. Number must be positive.");
            input.close();
            return;
        }
        int temp = number;
        int digitCount = 0;
        while (temp > 0) {
            digitCount++;
            temp /= 10;
        }
        if (number == 0) {
            digitCount = 1;
        }
        int[] digits = new int[digitCount];
        temp = number;

        for (int i = 0; i < digitCount; i++) {
            digits[i] = temp % 10;
            temp /= 10;
        }
        int[] frequency = new int[10];
        for (int i = 0; i < digits.length; i++) {
            frequency[digits[i]]++;
        }
        System.out.println("\nDigit Frequency:");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " occurs " + frequency[i] + " time(s)");
            }
        }

        input.close();
    }
}