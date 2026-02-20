package com.week1_2.level3;

import java.util.Scanner;

class TotalIncome {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Salary: ");
        double salary = input.nextDouble();

        System.out.print("Enter Bonus: ");
        double bonus = input.nextDouble();

        double totalIncome = salary + bonus;

        System.out.println("The salary is INR " + salary +
                " and bonus is INR " + bonus +
                ". Hence Total Income is INR " + totalIncome);

        input.close();
    }
}