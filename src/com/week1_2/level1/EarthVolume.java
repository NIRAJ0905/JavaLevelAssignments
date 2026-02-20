package com.week1_2.level1;

public class EarthVolume {

    public static void main(String[] args) {

        double radiusKm = 6378;
        double pi = 3.14159265359;

        double volumeKm = (4.0 / 3) * pi * Math.pow(radiusKm, 3);

        double conversionFactor = 1.60934; // km to miles
        double radiusMiles = radiusKm / conversionFactor;
        double volumeMiles = (4.0 / 3) * pi * Math.pow(radiusMiles, 3);

        System.out.println("The volume of earth in cubic kilometers is " +
                volumeKm + " and cubic miles is " + volumeMiles);
    }
}