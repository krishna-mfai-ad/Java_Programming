package com.mctExamination;

import java.util.Scanner;

public class pattern {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no. of row:");
		int n=s.nextInt();
		for(int i=1;i<n;i++) {
			for(int j=i;j<=n;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int j=i;j<=n;j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

}
