package com.mctExamination;

import java.util.Scanner;

public class fibonaciisum {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the N:");
		int n=s.nextInt();
		int sum=1;
		int k,a=0,b=1;
		System.out.print("SUM OF FIBO: ");
		for(int i=2;i<n;i++) {
			k=a+b;
			a=b;
			b=k;
			sum=sum+k;
		}
		System.out.println(sum);
		s.close();
		
	}

}
