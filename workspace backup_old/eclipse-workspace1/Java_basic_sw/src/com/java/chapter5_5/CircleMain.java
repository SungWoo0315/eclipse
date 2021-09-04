package com.java.chapter5_5;

public class CircleMain {

	public static void main(String[] args) {

		Circle c = new Circle("피자", 10);
		Circle c2 = new Circle("도넛", 2);
		
		System.out.println( c.name + " : " + c.getArea() );
		System.out.println( c2.name + " : " + c2.getArea());

	}

}
