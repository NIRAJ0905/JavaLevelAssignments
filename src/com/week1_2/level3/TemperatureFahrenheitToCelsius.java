package com.week1_2.level3;

import java.util.Scanner;

class TemperatureFahrenheitToCelsius {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        double celsiusResult = (fahrenheit - 32) * 5 / 9;

        System.out.println("The " + fahrenheit + 
                " Fahrenheit is " + celsiusResult + " Celsius");

        input.close();
    }
}