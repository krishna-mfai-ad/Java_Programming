package com.practice;
import java.util.Scanner;

public class LargestLexicographicalArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the size of the array
        int n = scanner.nextInt();
        int[] arr = new int[n];

        // Read the elements of the array
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Read the maximum number of swaps allowed
        int B = scanner.nextInt();

        // Process to get the largest lexicographical array
        for (int i = 0; i < n && B > 0; i++) {
            int maxIndex = i;

            // Find the maximum element within the next B elements
            for (int j = i + 1; j < n && j <= i + B; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }

            // Calculate the number of swaps required to bring the max element to position i
            int swaps = maxIndex - i;

            // Move the max element to position i by swapping
            for (int j = maxIndex; j > i; j--) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
            }

            // Decrement the number of swaps allowed
            B -= swaps;
        }

        // Print the resulting array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

