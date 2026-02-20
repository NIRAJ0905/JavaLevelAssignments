package com.week3_4.level1;
import java.util.Scanner;

public class CountdownWhile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter starting number: ");
        int n = in.nextInt();
        while (n >= 0) {
            System.out.println(n);
            n--;
        }
        in.close();
    }
}