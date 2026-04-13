package com.week7_8.level1;
import java.util.Scanner;

public class Trigonometry {

    public double[] calculate(double angle) {

        double rad = Math.toRadians(angle);

        return new double[]{
            Math.sin(rad),
            Math.cos(rad),
            Math.tan(rad)
        };
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double angle = input.nextDouble();

        Trigonometry obj = new Trigonometry();

        double[] result = obj.calculate(angle);

        System.out.println("Sin: " + result[0]);
        System.out.println("Cos: " + result[1]);
        System.out.println("Tan: " + result[2]);

        input.close();
    }
}