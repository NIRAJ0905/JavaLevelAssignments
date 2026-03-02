package com.week5_6.level1;
import java.util.Scanner;

public class StoreNumbersUntilZero {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];
        int index = 0;

        while (true) {
            System.out.print("Enter number: ");
            double num = input.nextDouble();

            if (num <= 0 || index == numbers.length)
                break;

            numbers[index] = num;
            index++;
        }

        double total = 0;

        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
            total += numbers[i];
        }

        System.out.println("Total = " + total);

        input.close();
    }
}