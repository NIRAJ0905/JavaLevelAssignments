package com.week9_10.level1;
import java.util.Scanner;

class LowerCaseProgram {

    public static String toLowerManual(String text) {

        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch + 32);
            }

            result += ch;
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String manual = toLowerManual(text);
        String builtIn = text.toLowerCase();

        System.out.println("Manual: " + manual);
        System.out.println("Built-in: " + builtIn);
        System.out.println("Same? " + manual.equals(builtIn));

        sc.close();
    }
}