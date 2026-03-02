package com.week5_6.level1;
import java.util.Scanner;

public class NumberCheckArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();

            if (numbers[i] > 0) {
                if (numbers[i] % 2 == 0)
                    System.out.println(numbers[i] + " is Positive Even");
                else
                    System.out.println(numbers[i] + " is Positive Odd");
            } 
            else if (numbers[i] < 0) {
                System.out.println(numbers[i] + " is Negative");
            } 
            else {
                System.out.println("Zero");
            }
        }

        if (numbers[0] > numbers[4])
            System.out.println("First element is greater than last");
        else if (numbers[0] < numbers[4])
            System.out.println("First element is less than last");
        else
            System.out.println("First and last elements are equal");

        input.close();
    }
}