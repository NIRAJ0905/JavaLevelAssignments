package com.week3_4.level1;

import java.util.Scanner;

// Class to check if a number is divisible by 5
public class DivisibleByFive {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check divisibility
        boolean isDivisible = (number % 5 == 0);

        // Print result
        System.out.println("Is the number " + number + 
                           " divisible by 5? " + isDivisible);

        // Close scanner
        input.close();
    }
}