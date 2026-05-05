package com.week9_10.level2;

import java.util.Scanner;

public class SplitTextProgram {

    // Count words
    public static int countWords(String text) {
        int count = 1;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                count++;
            }
        }
        return count;
    }

    // Split using charAt
    public static String[] splitText(String text) {
        int wordCount = countWords(text);
        String[] words = new String[wordCount];

        int start = 0, index = 0;

        for (int i = 0; i <= text.length(); i++) {
            if (i == text.length() || text.charAt(i) == ' ') {
                words[index++] = text.substring(start, i);
                start = i + 1;
            }
        }
        return words;
    }

    // Compare arrays
    public static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;

        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = scanner.nextLine();

        String[] customSplit = splitText(text);
        String[] actualSplit = text.split(" ");

        boolean isSame = compareArrays(customSplit, actualSplit);

        System.out.println("Comparison Result: " + isSame);
    }
}