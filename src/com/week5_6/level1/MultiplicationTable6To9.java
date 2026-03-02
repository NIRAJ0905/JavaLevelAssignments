package com.week5_6.level1;
import java.util.Scanner;

public class MultiplicationTable6To9 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = input.nextInt();

        int[] result = new int[4];
        int index = 0;

        for (int i = 6; i <= 9; i++) {
            result[index] = number * i;
            index++;
        }

        index = 0;

        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + result[index]);
            index++;
        }

        input.close();
    }
}