package com.week1_2.level3;

import java.util.Scanner;

class SimpleInterestCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Principal: ");
        double principal = input.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        double rate = input.nextDouble();

        System.out.print("Enter Time: ");
        double time = input.nextDouble();

        double simpleInterest = principal * rate * time / 100;

        System.out.println("The Simple Interest is " + simpleInterest +
                " for Principal " + principal +
                ", Rate of Interest " + rate +
                " and Time " + time);

        input.close();
    }
}