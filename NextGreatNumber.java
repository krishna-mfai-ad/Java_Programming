package javaBasics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class NextGreatNumber {
	private static ArrayList<Integer> result(int[] arr, int n) {
		ArrayList<Integer> ans = new ArrayList<>();
		for (int i = 0; i < n; i++)
		{
			int nextGreater = -1; 
			for (int j = i + 1; j < n; j++) {
				if (arr[j] > arr[i]) {
					nextGreater = arr[j];
					break;
				}
			}
			ans.add(nextGreater);
		}
		return ans;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size Of Array:");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter Elements Of Array:");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println();
		System.out.println("Input Array: " + Arrays.toString(arr));
		System.out.println("Output Array: " + result(arr, size));
	}
}
