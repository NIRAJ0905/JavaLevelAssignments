package com.week7_8.level1;
import java.util.Scanner;

public class Handshakes {

    public int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        Handshakes obj = new Handshakes();

        System.out.println(obj.calculateHandshakes(n));

        input.close();
    }
}