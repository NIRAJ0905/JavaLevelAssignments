package com.week7_8.level1;
import java.util.Scanner;

public class SimpleInterest {

    public double calculateSI(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double principal = input.nextDouble();
        double rate = input.nextDouble();
        double time = input.nextDouble();

        SimpleInterest obj = new SimpleInterest();

        double si = obj.calculateSI(principal, rate, time);

        System.out.println("Simple Interest = " + si);

        input.close();
    }
}