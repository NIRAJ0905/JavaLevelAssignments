package com.week3_4.level2;
import java.util.Scanner;

public class YoungestAndTallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter age of Amar, Akbar, Anthony: ");
        int ageAmar = input.nextInt();
        int ageAkbar = input.nextInt();
        int ageAnthony = input.nextInt();

        System.out.print("Enter height of Amar, Akbar, Anthony: ");
        double heightAmar = input.nextDouble();
        double heightAkbar = input.nextDouble();
        double heightAnthony = input.nextDouble();

        // Find youngest
        int minAge = ageAmar;
        String youngest = "Amar";

        if (ageAkbar < minAge) {
            minAge = ageAkbar;
            youngest = "Akbar";
        }
        if (ageAnthony < minAge) {
            youngest = "Anthony";
        }

        // Find tallest
        double maxHeight = heightAmar;
        String tallest = "Amar";

        if (heightAkbar > maxHeight) {
            maxHeight = heightAkbar;
            tallest = "Akbar";
        }
        if (heightAnthony > maxHeight) {
            tallest = "Anthony";
        }

        System.out.println("Youngest friend: " + youngest);
        System.out.println("Tallest friend: " + tallest);

        input.close();
    }
}