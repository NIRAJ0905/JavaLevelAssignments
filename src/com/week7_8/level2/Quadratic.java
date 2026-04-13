package com.week7_8.level2;

import java.util.Scanner;

public class Quadratic {

    public static double[] findRoots(double a, double b, double c) {
        double d = b * b - 4 * a * c;

        if (d > 0) {
            return new double[]{
                (-b + Math.sqrt(d)) / (2 * a),
                (-b - Math.sqrt(d)) / (2 * a)
            };
        } else if (d == 0) {
            return new double[]{-b / (2 * a)};
        } else {
            return new double[]{};
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a, b, c: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double[] roots = findRoots(a, b, c);

        if (roots.length == 0)
            System.out.println("No real roots");
        else
            for (double r : roots)
                System.out.println("Root: " + r);

        sc.close();
    }
}