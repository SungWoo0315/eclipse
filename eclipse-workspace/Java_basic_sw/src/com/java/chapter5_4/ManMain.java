package com.java.chapter5_4;

public class ManMain {

	public static void main(String[] args) {
		
		Man m1 = new Man(); 
		Man m2 = new Man(); 
		
		m1.name = "제임스";
		m1.age = 40;
		m1.child = 3;
		m1.gender = "남자";
		
//		m2.name = "카라";
//		m2.age = 41;
		m2.child = 0;
		m2.gender = "여자";
		
		m1.print();
		System.out.println("============");
		m2.print();
	}

}
