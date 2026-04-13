package com.week7_8.level1;
import java.util.Scanner;

public class SumNaturalNumbers {

    public int sum(int n) {

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        SumNaturalNumbers obj = new SumNaturalNumbers();

        System.out.println(obj.sum(n));

        input.close();
    }
}