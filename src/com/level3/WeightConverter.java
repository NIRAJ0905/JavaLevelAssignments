package com.level3;

import java.util.Scanner;

class WeightConverter {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();

        double kilograms = weight / 2.2;

        System.out.println("The weight of the person in pound is "
                + weight + " and in kg is "
                + kilograms);

        input.close();
    }
}