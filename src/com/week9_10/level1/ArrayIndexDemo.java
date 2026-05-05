package com.week9_10.level1;
import java.util.Scanner;

class ArrayIndexDemo {

    public static void handleException(String[] names) {
        try {
            System.out.println(names[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Handled ArrayIndexOutOfBoundsException");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] names = new String[3];

        for (int i = 0; i < names.length; i++) {
            names[i] = sc.next();
        }

        handleException(names);

        sc.close();
    }
}