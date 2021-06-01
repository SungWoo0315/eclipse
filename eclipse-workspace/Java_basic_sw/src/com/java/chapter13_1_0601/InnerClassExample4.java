package com.java.chapter13_1_0601;

public class InnerClassExample4 {
 
	public static void main(String[] args) {
		InnerClassExample4 exam = new InnerClassExample4();
		System.out.println(exam.getName().toString());
		
	}
	
	public Object getName() {
		//return new MyObject();
		
		return new Object() {
			@Override
			public String toString() {
				return this.getClass().getName();
			}
		};
	}
}
/*
class MyObject extends Object {
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getClass().getName();
	}
}*/