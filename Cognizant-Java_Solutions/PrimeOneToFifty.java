package com.ProblemSolvingCognizant;

public class PrimeOneToFifty {
	public static void main(String[] args) {
		for (int i = 1; i <= 50; i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");
			}
		}
	}

	static boolean isPrime(int n) {

		int m = n / 2;
		if (n == 0 || n == 1) {
			return false;
		} else {
			for (int i = 2; i <= m; i++) {
				if (n % i == 0) {
					return false;
				}
			}
		}
		return true;
	}
}
