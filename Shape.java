package com.mctExamination;

import java.util.Scanner;

public class Shape {
	
	public void calculateArea(int x,int y) {
		System.out.println("Area");
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the radius of the circle:");
		int r=s.nextInt();
		System.out.println("Enter the length of the rectangle:");
		int l=s.nextInt();
		System.out.println("Enter the width of the rectangle:");
		int w=s.nextInt();
		circle c=new circle();
		c.calculateArea(r);
		rectangle rec=new rectangle();
		rec.calculateArea(l,w);
		s.close();
	}

}
class circle extends Shape{
	public void calculateArea(int x) {
		double Area=3.14*x*x;
		System.out.println("Area of Circle: " + Area );
	}
	
}
class rectangle extends Shape{
	public void calculateArea(int x,int y) {
		int Area=x*y;
		System.out.println("Area of Rectangle: " + Area );
	}
	
}