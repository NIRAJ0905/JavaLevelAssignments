package com.week3_4.level2;
import java.util.Scanner;

public class FactorsWhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int number = input.nextInt();

        if (number > 0) {
            int i = 1;
            System.out.println("Factors are:");
            while (i < number) {
                if (number % i == 0) {
                    System.out.println(i);
                }
                i++;
            }
        } else {
            System.out.println("Not a positive integer");
        }

        input.close();
    }
}