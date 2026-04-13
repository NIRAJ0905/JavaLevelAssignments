package com.week7_8.level1;
import java.util.Scanner;

public class AthleteRounds {

    public double calculateRounds(double a, double b, double c) {
        double perimeter = a + b + c;
        double totalDistance = 5000;
        return totalDistance / perimeter;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        AthleteRounds obj = new AthleteRounds();

        System.out.println(obj.calculateRounds(a, b, c));

        input.close();
    }
}