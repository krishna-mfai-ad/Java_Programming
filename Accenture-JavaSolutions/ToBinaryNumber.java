package com.Coding;

public class ToBinaryNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 5;
		String s = Integer.toBinaryString(input);
		System.out.println(s);

		//String s1 = "01000011";
	//	int x = Integer.parseInt(s1, 2);
		// Define the characters
		String letters = "ACEINRT";

		System.out.println("Binary representation of letters in ACEINRT:");

		// Loop through each character in the string
		for (int i = 0; i < letters.length(); i++) {
			
			char letter = letters.charAt(i); // Get the character
			int asciiValue = (int) letter; // Get the ASCII value
			String binaryValue = Integer.toBinaryString(asciiValue); // Convert ASCII to binary
			System.out.println(letter + ": " + binaryValue);
		}
	}
}
