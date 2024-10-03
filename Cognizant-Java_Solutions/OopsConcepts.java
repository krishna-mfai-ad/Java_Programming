package com.ProblemSolvingCognizant;

//Abstract class for Shape
abstract class Shape {
	// Abstract method to calculate area
	public abstract double calculateArea();
}

//Circle class inherits from Shape
class Circle extends Shape {
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		return Math.PI * radius * radius; // Area = π * r²
	}
}

//Rectangle class inherits from Shape
class Rectangle extends Shape {
	private double length;
	private double width;

	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	@Override
	public double calculateArea() {
		return length * width; // Area = length * width
	}
}

//Main class to demonstrate OOP concepts
public class OopsConcepts {
	public static void main(String[] args) {
		// Polymorphism: Using Shape reference to refer to Circle and Rectangle objects
		Shape myCircle = new Circle(5); // Create Circle
		Shape myRectangle = new Rectangle(4, 6); // Create Rectangle

		System.out.println("Area of Circle: " + myCircle.calculateArea());
		System.out.println("Area of Rectangle: " + myRectangle.calculateArea());
	}
}
