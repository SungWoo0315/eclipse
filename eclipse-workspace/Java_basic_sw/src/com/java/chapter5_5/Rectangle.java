package com.java.chapter5_5;

public class Rectangle {
	
	String name;
	float weight;
	float height;
	
	public Rectangle(String n, float w, float h) {
		
		name = n;
		height = h;
		weight = w;
		
		System.out.println("높이 : " + height + " X "  
				+ "너비 : " + weight + "=" + height*weight);
	}
	
	public float getArea() {
		
		float result = weight * height;
		return result;
		
	}
	
	
	
}
