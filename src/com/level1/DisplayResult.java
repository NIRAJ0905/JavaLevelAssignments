package com.level1;

// Program to display student result
public class DisplayResult {

    public static void main(String[] args) {

        // Declare variables
        String name = "Sam";
        int rollNumber = 1;
        double percentMarks = 99.99;
        char result = 'P';

        // Display result
        System.out.println("Displaying Result:\n" +
                name + " with Roll Number " + rollNumber +
                " has scored " + percentMarks +
                "% and Result is " + result);
    }
}