package com.week5_6.level2;
import java.util.Scanner;

public class StudentGrade2DArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = input.nextInt();

        double[][] marks = new double[n][3];
        double[] percentage = new double[n];
        String[] grade = new String[n];

        for (int i = 0; i < n; i++) {

            System.out.println("Student " + (i+1));

            for (int j = 0; j < 3; j++) {
                marks[i][j] = input.nextDouble();

                if (marks[i][j] < 0) {
                    System.out.println("Invalid marks. Re-enter.");
                    i--;
                    break;
                }
            }

            percentage[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3;

            if (percentage[i] >= 90)
                grade[i] = "A";
            else if (percentage[i] >= 75)
                grade[i] = "B";
            else if (percentage[i] >= 60)
                grade[i] = "C";
            else
                grade[i] = "D";
        }

        System.out.println("\nResults:");
        for (int i = 0; i < n; i++) {
            System.out.println("Percentage: " + percentage[i] +
                    " Grade: " + grade[i]);
        }

        input.close();
    }
}