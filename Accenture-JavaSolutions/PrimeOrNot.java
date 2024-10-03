package com.Coding;

public class PrimeOrNot {

	public static Boolean ans(int n) {
		int half=n/2;
		if(n==0||n==1) {
			return false;
		}
		else {
			for(int i=2;i<=half;i++) {
				if(half%i==0) {
					System.out.println("Not prime");
					return false;
				}
			}
			return true;
		}
//		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=2000;
		System.out.println(ans(n));
	}

}
