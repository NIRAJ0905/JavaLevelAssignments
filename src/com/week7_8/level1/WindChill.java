package com.week7_8.level1;
import java.util.Scanner;

public class WindChill {

    public double calculate(double temp, double windSpeed) {
        return 35.74 + 0.6215 * temp +
               (0.4275 * temp - 35.75) * Math.pow(windSpeed, 0.16);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double temp = input.nextDouble();
        double speed = input.nextDouble();

        WindChill obj = new WindChill();

        System.out.println(obj.calculate(temp, speed));

        input.close();
    }
}