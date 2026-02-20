package com.week1_2.level1;
public class AveragePCM {

    public static void main(String[] args) {

        String name = "Sam";
        int maths = 94;
        int physics = 95;
        int chemistry = 96;

        int total = maths + physics + chemistry;
        double average = total / 3.0;

        System.out.println(name + "'s average mark in PCM is " + average);
    }
}