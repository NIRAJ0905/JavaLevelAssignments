package com.week3_4.level3;
import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Physics, Chemistry, Maths marks: ");
        double physics = input.nextDouble();
        double chemistry = input.nextDouble();
        double maths = input.nextDouble();

        double percentage = (physics + chemistry + maths) / 3;

        String grade;

        if (percentage >= 90)
            grade = "A";
        else if (percentage >= 75)
            grade = "B";
        else if (percentage >= 60)
            grade = "C";
        else
            grade = "D";

        System.out.println("Percentage: " + percentage);
        System.out.println("Grade: " + grade);

        input.close();
    }
}