package com.java.chapter8_6_0527;

import java.util.ArrayList;
import java.util.Iterator;

class Shape {
	public void draw() {
		System.out.println("Shape");
	}
}

class circle extends Shape {
	public void draw() {
		System.out.println("Circle");
	}
}

class Triangle extends Shape {
	public void draw() {
		System.out.println("Triangle");
	}
}

public class Q5_279p {
	public static void main (String[] args) {
		ArrayList<Shape> list = new ArrayList<Shape>();
		list.add(new circle());
		list.add(new Triangle());
		list.add(new Shape());
		
		for(Shape shape : list) {
			shape.draw();
		}
	}
}