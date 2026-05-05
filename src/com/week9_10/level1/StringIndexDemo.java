package com.week9_10.level1;
import java.util.Scanner;

class StringIndexDemo {

    public static void generateException(String text) {
        System.out.println(text.charAt(100));
    }

    public static void handleException(String text) {
        try {
            System.out.println(text.charAt(100));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Handled StringIndexOutOfBoundsException");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.next();

        // generateException(text);

        handleException(text);

        sc.close();
    }
}