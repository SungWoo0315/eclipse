package com.java.chapter5_5;

public class RectangleMain {

	public static void main(String[] args) {

		Rectangle re = new Rectangle("사각", 20, 15);
		Rectangle re2 = new Rectangle("직사각1", 19, 80);
		
		System.out.println( re.name + " : " + re.getArea() );
		System.out.println( re2.name + " : " + re2.getArea());

	}

}
