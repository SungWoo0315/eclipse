package com.java.chapter3;

public class StringConcat {

	public static void main(String[] args) {

		// boolean t = true + false;
		
		// new String()
		String s = "";	// 스트링 리터럴
		
		/** 문자열 연산자 '+' 의 쓰임새 **/
		
		System.out.println("1+1 = " + "결과" + (1 +1) ); // (1+1)연산이 됨.
		
		System.out.println("유니코드 = " + "\uADAC"); // 스타트 시퀀스 \
		
		System.out.println("유니코드 escape " + "\\uADAC" ); // 시퀀스 무시는 \하나더 붙인다.
		
		System.out.println(" 정수 + 정수 = " + 5 + 10 ); // 510으로 문자로 인식.
		
		System.out.println(" 정수 + 실수 = " + 5 + 10.9 );
		
		System.out.println(5 + 10.9 + " = 정수 + 실수" );
		
	}

}
