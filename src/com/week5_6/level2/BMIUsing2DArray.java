package com.week5_6.level2;
import java.util.Scanner;

public class BMIUsing2DArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int n = input.nextInt();

        double[][] personData = new double[n][3]; // 0=weight,1=height,2=bmi
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {

            System.out.println("Person " + (i+1));

            System.out.print("Enter weight (kg): ");
            personData[i][0] = input.nextDouble();

            System.out.print("Enter height (cm): ");
            personData[i][1] = input.nextDouble();

            if (personData[i][0] <= 0 || personData[i][1] <= 0) {
                System.out.println("Invalid input. Re-enter.");
                i--;
                continue;
            }

            double heightM = personData[i][1] / 100;
            personData[i][2] = personData[i][0] / (heightM * heightM);

            if (personData[i][2] < 18.5)
                status[i] = "Underweight";
            else if (personData[i][2] < 25)
                status[i] = "Normal";
            else if (personData[i][2] < 30)
                status[i] = "Overweight";
            else
                status[i] = "Obese";
        }

        System.out.println("\nResults:");
        for (int i = 0; i < n; i++) {
            System.out.println("Weight: " + personData[i][0] +
                    " Height: " + personData[i][1] +
                    " BMI: " + personData[i][2] +
                    " Status: " + status[i]);
        }

        input.close();
    }
}