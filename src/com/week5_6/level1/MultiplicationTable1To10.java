package com.week5_6.level1;
import java.util.Scanner;

public class MultiplicationTable1To10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = input.nextInt();

        int[] table = new int[10];

        for (int i = 0; i < table.length; i++) {
            table[i] = number * (i + 1);
        }

        for (int i = 0; i < table.length; i++) {
            System.out.println(number + " * " + (i+1) + " = " + table[i]);
        }

        input.close();
    }
}