package com.ProblemSolvingCognizant;

public class PalindromeCheck {

    public static void main(String[] args) {
        String str = "madam";  // You can test with different strings

        if (isPalindrome(str)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }

    // Method to check if a string is a palindrome
    private static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;  // Return false if characters don't match
            }
            start++;
            end--;
        }
        return true;
    }
    private static boolean isPalindrome2(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);  // Compare original string with reversed string
    }
    private static boolean isPalindrome3(int num) {
        int original = num;
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return original == reversed;  // Compare original number with reversed number
    }
}
