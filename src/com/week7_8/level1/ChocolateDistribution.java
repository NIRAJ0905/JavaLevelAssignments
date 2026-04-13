package com.week7_8.level1;
import java.util.Scanner;

public class ChocolateDistribution {

    public int[] distribute(int chocolates, int children) {
        return new int[]{chocolates / children, chocolates % children};
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int chocolates = input.nextInt();
        int children = input.nextInt();

        ChocolateDistribution obj = new ChocolateDistribution();

        int[] result = obj.distribute(chocolates, children);

        System.out.println("Each gets: " + result[0]);
        System.out.println("Remaining: " + result[1]);

        input.close();
    }
}