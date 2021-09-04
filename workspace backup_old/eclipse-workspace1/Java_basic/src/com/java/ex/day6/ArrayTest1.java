package com.java.ex.day6;

public class ArrayTest1 {

	public static void main(String[] args) {
		// 10개 짜리 문자열 배열
		// 1번
		String[] testArray;
		testArray = new String[10];
		
		String[] testArray2 = new String[10];  // 아래와 같은형식
		String testArray3[] = new String[10];  // 위와 같은형식.
		
		
		// 2번
		String[] testArray4 = new String[] {
				"1", "2", "3", "4", "5",
				"6", "7", "8", "9", "10"
				};
		
		// 3번 
		String[] testArray5 = {
				"1", "2", "3", "4", "5",
				"6", "7", "8", "9", "10"
				};
		
		String[] testArray6 = {};
		// 2번 3번 같은 방법이다.
		
		System.out.println("testArray = " + testArray.length);
		System.out.println("testArray2 = " + testArray2.length);
		System.out.println("testArray3 = " + testArray3.length);
		System.out.println("testArray4 = " + testArray4.length);
		System.out.println("testArray5 = " + testArray5.length);
		System.out.println("testArray6 = " + testArray6.length);
		
		//double 5, 8, 30 개 크기의 배열 3개 만들고, 크기 출력!
		
		double[] testArraydouble = new double[5];
		
		double testArraydouble2[] = new double[8];
		
		double[] testArraydouble3;
		testArraydouble3 = new double[30];
		
		System.out.println("testArraydouble = " + testArraydouble.length);
		System.out.println("testArraydouble2 = " + testArraydouble2.length);
		System.out.println("testArraydouble3 = " + testArraydouble3.length);
	}

}
