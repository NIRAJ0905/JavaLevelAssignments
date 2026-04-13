package com.week7_8.level1;
import java.util.Scanner;

public class SmallestLargest {

    public int[] find(int a, int b, int c) {

        int min = Math.min(a, Math.min(b, c));
        int max = Math.max(a, Math.max(b, c));

        return new int[]{min, max};
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        SmallestLargest obj = new SmallestLargest();

        int[] result = obj.find(a, b, c);

        System.out.println("Min: " + result[0]);
        System.out.println("Max: " + result[1]);

        input.close();
    }
}