package com.week5_6.level1;
import java.util.Scanner;

public class StudentVotingCheck {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] ages = new int[10];

        System.out.println("Enter ages of 10 students:");

        for (int i = 0; i < ages.length; i++) {
            ages[i] = input.nextInt();

            if (ages[i] < 0) {
                System.out.println("Invalid Age");
            } 
            else if (ages[i] >= 18) {
                System.out.println("Student with age " + ages[i] + " can vote");
            } 
            else {
                System.out.println("Student with age " + ages[i] + " cannot vote");
            }
        }

        input.close();
    }
}