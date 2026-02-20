package com.week1_2.level3;

import java.util.Scanner;

class TemperatureCelsiusToFahrenheit {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take Celsius input
        System.out.print("Enter temperature in Celsius: ");
        double celsius = input.nextDouble();

        // Convert to Fahrenheit
        double fahrenheitResult = (celsius * 9 / 5) + 32;

        // Display result
        System.out.println("The " + celsius + " Celsius is " 
                + fahrenheitResult + " Fahrenheit");

        input.close();
    }
}