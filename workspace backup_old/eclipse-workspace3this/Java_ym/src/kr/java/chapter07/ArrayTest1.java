package kr.java.chapter07;

import java.util.Arrays;

public class ArrayTest1 {

	public static void main(String[] args) {
		// 10개짜리 문자열 배열 초기화
		
		// 1번 방법
/*		String[] testArray; // 선언
		testArray = new String[10]; // 할당
		
		String[] testArray2 = new String[10]; // java 스타일
		String testArray3[] = new String[10]; // c스타일 문법 -> java에서도 적용 가능
		
		// 2번 방법
		String[] testArray4 = new String[] { 
				"1", "2", "3", "4", "5", 
				"6", "7", "8", "9", "10"
		};
		
		// 3번 방법 -> 2번 방법의 다른 방식
		String[] testArray5 = {
				"1", "2", "3", "4", "5", 
				"6", "7", "8", "9", "10"
		};
		
		String[] testArray6 = {}; // 만들어만 놓은거
		
		System.out.println("testArray = " + testArray.length);
		System.out.println("testArray2 = " + testArray2.length);
		System.out.println("testArray3 = " + testArray3.length);
		System.out.println("testArray4 = " + testArray4.length);
		System.out.println("testArray5 = " + testArray5.length);
		System.out.println("testArray6 = " + testArray6.length);
		
		
		// double형으로 5, 8, 30개 크기의 배열 3개 만들고, 크기 출력
		
		double[] testArrayV1;
		testArrayV1 = new double[5];
		double[] testArrayV2 = new double[8];
		double testArrayV3[] = new double[30];
		
		double[] testArrayV4 = new double[] {
				'1', '2', '3', '4', '5'
		};
		double[] testArrayV5 = {
				'1', '2', '3', '4', '5', 
				'6', '7', '8'
		};
		
		
		System.out.println("testArrayV1 = " + testArrayV1.length);
		System.out.println("testArrayV2 = " + testArrayV2.length);
		System.out.println("testArrayV3 = " + testArrayV3.length);
		System.out.println("testArrayV4 = " + testArrayV4.length);
		System.out.println("testArrayV5 = " + testArrayV5.length);
		
		*/
		
		String[] strArray = new String[] { 
				"1", "2", "3", "4", "5", 
				"6", "7", "8", "9", "10"
		};
		System.out.println(strArray.toString());
		System.out.println(strArray);
		
		
		for(int i=0; i < strArray.length; i++) {
			int t = i * Integer.parseInt(strArray[i]);
			strArray[i] = t + "";
			System.out.print(strArray[i]);
		}
		System.out.println("");
				
		strArray[5] = "Hello";
		
		// java.util.Arrays
		System.out.println(Arrays.toString(strArray));
		
	}

}
