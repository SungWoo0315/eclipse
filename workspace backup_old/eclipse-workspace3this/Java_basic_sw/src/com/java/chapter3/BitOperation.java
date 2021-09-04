package com.java.chapter3;

public class BitOperation {

	public static void main(String[] args) {
		int num1 = 5;	// 2진수 0000 0101
		int num2 = 10;	// 2진수 0000 1010
		
		int result = num1 & num2;	// 0000 0000
		System.out.println("num1 & num2 = " + result); 
		
		result     = num1 | num2;
		System.out.println("num1 | num2 = " + result);
		
		result     = num1 ^ num2;
		System.out.println("num1 ^ num2 = " + result);
		
		result     = ~num1		  ;
		System.out.println("~num1 = " + result);
		
		System.out.println("--------------------");
		
		// 논리 연산자와 비트 논리 연산자 차이
		boolean t = (num1 >+ num2 ) && (num1 >= num2);
		
		// 출력 안됨.
//		t = (num1 & num2 ) && (num1 ^ num2); // 값이 명제계산 되므로 오류. 10 과 4 true? false? 안됨. 
		
		t = ( 5 > 10 ) & ( 10 < 20 ); // false & true : 비트 연산. 출력 됨.
		System.out.println(t);
		
		t = ( 5 < 10 ) & ( 10 < 20 ); // true & true : 비트 연산. 출력 됨.
		System.out.println(t);
		// boolean 값도 비트연산 가능.
	}

}
