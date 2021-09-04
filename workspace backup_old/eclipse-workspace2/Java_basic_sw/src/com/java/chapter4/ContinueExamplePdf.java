package com.java.chapter4;

public class ContinueExamplePdf {

	public static void main(String[] args) {
		//[문제]
		//1에서 20까지의 수에서 2의배수와 3의배수를 제외한
		//숫자를 출력하세요
		//(for문, continue문사용)
		
		
		int total = 0;
		int num;
		
		for(num = 1; num <= 20; num++) {
			if(num % 3 == 0 || num % 2 == 0)
				continue;
			System.out.println(num);
		}
	}

}
