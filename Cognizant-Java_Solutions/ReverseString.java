package com.ProblemSolvingCognizant;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Krishna";
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
		
		
		StringBuilder rWord = new StringBuilder(str);
		rWord.reverse();
		System.out.println(rWord);
	}

}
