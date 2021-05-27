package com.java.chapter5_4;

public class Man {
	int age;
	String name;
	String gender; //남자, 여자
	boolean married;
	int child; //자식 수
	
	public void print() {
		System.out.println("1. 나이: " + age);
		System.out.println("2. 이름: " + name);
		System.out.println("3. 결혼: " + married);
		System.out.println("4. 자녀: " + child);
	}
}
