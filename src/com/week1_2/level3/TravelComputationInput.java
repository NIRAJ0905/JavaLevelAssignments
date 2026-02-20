package com.week1_2.level3;

import java.util.Scanner;

class TravelComputationInput {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = input.nextLine();

        System.out.print("Enter From City: ");
        String fromCity = input.nextLine();

        System.out.print("Enter Via City: ");
        String viaCity = input.nextLine();

        System.out.print("Enter To City: ");
        String toCity = input.nextLine();

        System.out.print("Enter Distance From-To-Via (km): ");
        double distanceFromToVia = input.nextDouble();

        System.out.print("Enter Distance Via-To-Final (km): ");
        double distanceViaToFinalCity = input.nextDouble();

        System.out.print("Enter Time From-To-Via (minutes): ");
        int timeFromToVia = input.nextInt();

        System.out.print("Enter Time Via-To-Final (minutes): ");
        int timeViaToFinalCity = input.nextInt();

        double totalDistance = distanceFromToVia + distanceViaToFinalCity;
        int totalTime = timeFromToVia + timeViaToFinalCity;

        System.out.println("The Total Distance travelled by " + name +
                " from " + fromCity + " to " + toCity +
                " via " + viaCity + " is " + totalDistance +
                " km and the Total Time taken is " + totalTime + " minutes");

        input.close();
    }
}