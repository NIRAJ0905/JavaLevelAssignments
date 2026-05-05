package com.week9_10.level1;
import java.util.Scanner;

class NumberFormatDemo {

    public static void handleException(String text) {
        try {
            int num = Integer.parseInt(text);
            System.out.println("Number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Handled NumberFormatException");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        String text = sc.next();

        handleException(text);

        sc.close();
    }
}