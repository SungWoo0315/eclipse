package com.java.chapter5_2;

public class FunctionTest {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 20;
		
		int sum = add(num1, num2);
		
		
	}
	
	
	// 매개변수에 인수 2개를 받아서 계산결과를 반환 메서드.
	// static이 들어가줘야 한다. 위에서 선언되어서.
	public static int add(int i1, int i2) {
		int result = i1 + i2;
		return result;
	}
}
