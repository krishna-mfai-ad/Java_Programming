package com.ProblemSolvingCognizant;

public class ArmstrongNumber {

    public static void main(String[] args) {
        int num = 9474;  // You can test with different numbers

        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
    }

    // Method to check if a number is an Armstrong number for any number of digits
    private static boolean isArmstrong(int num) {
        int original = num;
        int sum = 0;
        int digits = Integer.toString(num).length();  // Get the number of digits

        while (num != 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);  // Raise the digit to the power of the number of digits
            num /= 10;
        }

        return sum == original;  // Compare the sum with the original number
    }
}

