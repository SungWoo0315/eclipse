package com.java.ex.day6;

public class ArrayPdf {

	public static void main(String[] args) {
		
		// 실습 : 배열 데이터
		// 배열을 탐색한다.
		// 다음 같은 정수 배열을 "," 구분자로 입력받는다.
		// 그리고 그 중에서 가장 큰 수를 찾는 프로그램 작성
		// [-12, 2, -9, 5, 8,-2, 0, -8, 3, 10]
		
		int [] num = new int[] {
			-12, 2, -9, 5, 8,-2, 0, -8, 3, 10
		};
		
		int max = num[0];
		
		for (int i = 0; i<num.length; i++) {
			if(max < num[i]) {
				max = num[i];
			}
		}
		
		System.out.println("max : " + max);
		

	}

}
