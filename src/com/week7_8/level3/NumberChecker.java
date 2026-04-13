package com.week7_8.level3;

public class NumberChecker {

    // Count digits
    public static int countDigits(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }

    // Get digits array
    public static int[] getDigits(int num) {
        int count = countDigits(num);
        int[] digits = new int[count];

        for (int i = count - 1; i >= 0; i--) {
            digits[i] = num % 10;
            num /= 10;
        }
        return digits;
    }

    // Duck number (contains zero but not starting)
    public static boolean isDuck(int[] digits) {
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) return true;
        }
        return false;
    }

    // Armstrong
    public static boolean isArmstrong(int num) {
        int temp = num, sum = 0;
        int digits = countDigits(num);

        while (temp > 0) {
            int d = temp % 10;
            sum += Math.pow(d, digits);
            temp /= 10;
        }
        return sum == num;
    }

    // Largest & second largest
    public static int[] largestTwo(int[] arr) {
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2 && num != max1) {
                max2 = num;
            }
        }
        return new int[]{max1, max2};
    }

    // Smallest & second smallest
    public static int[] smallestTwo(int[] arr) {
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num < min1) {
                min2 = min1;
                min1 = num;
            } else if (num < min2 && num != min1) {
                min2 = num;
            }
        }
        return new int[]{min1, min2};
    }

    // Sum of digits
    public static int sumDigits(int[] arr) {
        int sum = 0;
        for (int n : arr) sum += n;
        return sum;
    }

    // Harshad
    public static boolean isHarshad(int num) {
        int sum = sumDigits(getDigits(num));
        return num % sum == 0;
    }

    // Palindrome
    public static boolean isPalindrome(int num) {
        int original = num, rev = 0;

        while (num > 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        return original == rev;
    }

    // Prime
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    // Neon
    public static boolean isNeon(int num) {
        int sq = num * num, sum = 0;
        while (sq > 0) {
            sum += sq % 10;
            sq /= 10;
        }
        return sum == num;
    }

    // Spy
    public static boolean isSpy(int num) {
        int sum = 0, prod = 1;
        while (num > 0) {
            int d = num % 10;
            sum += d;
            prod *= d;
            num /= 10;
        }
        return sum == prod;
    }

    // Buzz
    public static boolean isBuzz(int num) {
        return num % 7 == 0 || num % 10 == 7;
    }

    public static void main(String[] args) {
        int num = 153;

        int[] digits = getDigits(num);

        System.out.println("Duck: " + isDuck(digits));
        System.out.println("Armstrong: " + isArmstrong(num));
        System.out.println("Harshad: " + isHarshad(num));
        System.out.println("Palindrome: " + isPalindrome(num));
        System.out.println("Prime: " + isPrime(num));
        System.out.println("Neon: " + isNeon(num));
        System.out.println("Spy: " + isSpy(num));
        System.out.println("Buzz: " + isBuzz(num));
    }
}