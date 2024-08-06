package com.answer;

import java.util.Scanner;

public class PatternGenerator {

	public static void generatePattern(int n) {

		String topBottomRow = "X".repeat(n);

		String middleRow = "X" + "O".repeat(n - 2) + "X";

		for (int i = 0; i < n; i++) {
			if (i == 0 || i == n - 1) {
				System.out.println(topBottomRow);
			} else {
				System.out.println(middleRow);
			}
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the size of the pattern: ");
		int size = scanner.nextInt();

		generatePattern(size);

		scanner.close();
	}
}
