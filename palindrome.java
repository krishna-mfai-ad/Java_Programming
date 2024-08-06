package com.mctExamination;

import java.util.Scanner;

public class palindrome {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=s.next();
		String ans="";
		StringBuilder sb=new StringBuilder(str);
		String rev=sb.reverse().toString();
		if(str.equals(rev)) {
			for(int i=0;i<str.length();i++) {
				if(str.charAt(i)!='a'&& str.charAt(i)!='e' && str.charAt(i)!='i' && str.charAt(i)!='o' && str.charAt(i)!='u' ) {
					ans+=str.charAt(i);
				}
			}
			System.out.println(ans);
		}
		else {
			String ans2=str.charAt(str.length()-1) + str.substring(1,str.length()-1) + str.charAt(0);
			System.out.println(ans2);
		}
	}

}
