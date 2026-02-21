package com.week3_4.level3;
import java.util.Scanner;

public class CalculatorSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double first = input.nextDouble();

        System.out.print("Enter operator (+,-,*,/): ");
        String op = input.next();

        System.out.print("Enter second number: ");
        double second = input.nextDouble();

        switch (op) {
            case "+": System.out.println("Result: " + (first + second)); break;
            case "-": System.out.println("Result: " + (first - second)); break;
            case "*": System.out.println("Result: " + (first * second)); break;
            case "/": System.out.println("Result: " + (first / second)); break;
            default: System.out.println("Invalid Operator");
        }

        input.close();
    }
}