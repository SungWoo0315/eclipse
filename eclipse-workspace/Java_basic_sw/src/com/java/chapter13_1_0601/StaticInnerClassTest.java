package com.java.chapter13_1_0601;


public class StaticInnerClassTest {

	static class MyInnerClass {
		
	}
	
	public static void main(String[] args) {
		MyInnerClass obj = new StaticInnerClassTest.MyInnerClass();
	}

}
