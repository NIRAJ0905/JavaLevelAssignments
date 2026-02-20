package com.week3_4.level1;
import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = in.nextInt(), b = in.nextInt(), c = in.nextInt();
        int largest = (a > b && a > c) ? a : (b > c ? b : c);
        System.out.println("Largest number is " + largest);
        in.close();
    }
}