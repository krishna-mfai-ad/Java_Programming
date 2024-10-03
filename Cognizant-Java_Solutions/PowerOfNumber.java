package com.ProblemSolvingCognizant;

public class PowerOfNumber {

	public static void main(String[] args) {
		double base = 2;
		double exponent = 3;

		// Calculate the power using Math.pow()
		double result = Math.pow(base, exponent);

		System.out.println(result);

		System.out.println(power(base, exponent));
	}

	private static double power(double base, double exponent) {
		double result = 1;
		for (int i = 1; i <= exponent; i++) {
			result *= base;
		}
		return result;
	}
}
