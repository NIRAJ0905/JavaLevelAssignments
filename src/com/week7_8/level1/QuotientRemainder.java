package com.week7_8.level1;
import java.util.Scanner;

public class QuotientRemainder {

    public int[] calculate(int num, int divisor) {
        return new int[]{num / divisor, num % divisor};
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        int divisor = input.nextInt();

        QuotientRemainder obj = new QuotientRemainder();

        int[] result = obj.calculate(num, divisor);

        System.out.println("Quotient: " + result[0]);
        System.out.println("Remainder: " + result[1]);

        input.close();
    }
}