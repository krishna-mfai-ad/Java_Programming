package com.ProblemSolvingCognizant;

import java.util.Arrays;

public class SwapTwoNumber {
	
	public static void main(String[] args) {
		int[] arr= {3,1};
		System.out.println(swap1(arr));
		
	}
	static String swap(int[] arr) {
		arr[0]=arr[0]+arr[1];
		arr[1]=arr[0]-arr[1];
		arr[0]=arr[0]-arr[1];
		return Arrays.toString(arr);
		
	}
	static String swap1(int[] arr) {
		arr[0]=arr[0]^arr[1];
		arr[1]=arr[0]^arr[1];
		arr[0]=arr[0]^arr[1];
		return Arrays.toString(arr);
		
	}
}
