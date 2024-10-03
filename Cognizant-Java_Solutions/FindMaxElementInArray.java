package com.ProblemSolvingCognizant;

public class FindMaxElementInArray {
	public static void main(String[] args) {
		int[] arr = { 11, 8, 7, 116, 5, 4, 3, 2, 1 };
		// int max = Arrays.stream(arr).max().getAsInt();
		findMaxElementBS(arr);
		findMaxElement(arr);
	}

	private static void findMaxElement(int[] arr) {
		// TODO Auto-generated method stub
		int MaxElement = arr[0];
		for (int element : arr) {
			if (MaxElement < element) {
				MaxElement = element;
			}
		}
		System.out.println(MaxElement);
	}

	private static void findMaxElementBS(int[] arr) {
		int left = 0;
		int right = arr.length - 1;
		int max = Integer.MIN_VALUE;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (arr[mid] > max) {
				max = arr[mid];
			} else if (arr[mid] > arr[left]) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		System.out.println("BinarySearch: " + max);
	}
}
