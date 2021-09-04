package com.java.chapter5_5;

public class Circle {
	
	String name;
	double radius;
	
	
	public Circle(String n, double r) {
		
		name = n;
		radius = r;
		
//		System.out.println("높이 : " + height + " X "  
//				+ "너비 : " + weight + "=" + height*weight);
	}
	
	public double getArea() {
		
		double result = 3.14 * radius * radius;
		return result;
		
	}
}
