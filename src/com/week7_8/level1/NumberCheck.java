package com.week7_8.level1;
import java.util.Scanner;

public class NumberCheck {

    public int checkNumber(int num) {
        if (num > 0) return 1;
        else if (num < 0) return -1;
        else return 0;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        NumberCheck obj = new NumberCheck();

        System.out.println(obj.checkNumber(num));

        input.close();
    }
}