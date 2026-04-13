package com.week7_8.level2;

public class RandomArrayStats {

    public static int[] generate(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++)
            arr[i] = (int)(Math.random() * 9000) + 1000;
        return arr;
    }

    public static double[] stats(int[] arr) {
        int sum = 0, min = arr[0], max = arr[0];

        for (int n : arr) {
            sum += n;
            if (n < min) min = n;
            if (n > max) max = n;
        }

        double avg = (double) sum / arr.length;
        return new double[]{avg, min, max};
    }

    public static void main(String[] args) {
        int[] arr = generate(5);

        for (int n : arr)
            System.out.print(n + " ");

        double[] res = stats(arr);

        System.out.println("\nAverage: " + res[0]);
        System.out.println("Min: " + res[1]);
        System.out.println("Max: " + res[2]);
    }
}