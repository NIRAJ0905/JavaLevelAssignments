package com.week9_10.level1;
import java.util.Scanner;

class CharArrayCompare {

    public static char[] manualToCharArray(String text) {

        char[] arr = new char[text.length()];

        for (int i = 0; i < text.length(); i++) {
            arr[i] = text.charAt(i);
        }
        return arr;
    }

    public static boolean compareArrays(char[] a, char[] b) {

        if (a.length != b.length) return false;

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.next();

        char[] manual = manualToCharArray(text);
        char[] builtIn = text.toCharArray();

        System.out.println("Same? " + compareArrays(manual, builtIn));

        sc.close();
    }
}