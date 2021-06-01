package com.java.chapter13_1_0601;

public class MyClass1 {
	
	class MyInnerClass {
		// 멤버 속성
		static final int age = 0; // final 사용하면 static가능.
		String name;
	}
	
	public void test() {
		MyInnerClass in = new MyInnerClass();
	}
}
