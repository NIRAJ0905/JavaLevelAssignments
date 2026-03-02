package com.week5_6.level2;
import java.util.Scanner;

public class StudentGradeArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = input.nextInt();

        double[] physics = new double[n];
        double[] chemistry = new double[n];
        double[] maths = new double[n];
        double[] percentage = new double[n];
        String[] grade = new String[n];

        for (int i = 0; i < n; i++) {

            System.out.println("Student " + (i+1));

            System.out.print("Physics: ");
            physics[i] = input.nextDouble();

            System.out.print("Chemistry: ");
            chemistry[i] = input.nextDouble();

            System.out.print("Maths: ");
            maths[i] = input.nextDouble();

            if (physics[i] < 0 || chemistry[i] < 0 || maths[i] < 0) {
                System.out.println("Invalid marks. Re-enter.");
                i--;
                continue;
            }

            percentage[i] = (physics[i] + chemistry[i] + maths[i]) / 3;

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