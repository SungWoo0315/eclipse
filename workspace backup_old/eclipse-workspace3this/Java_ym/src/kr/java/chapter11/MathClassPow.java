package kr.java.chapter11;

import java.util.Scanner;

public class MathClassPow {

	public static void main(String[] args) {
		// Math class의 pow 사용
		// math.pow(3, 1) = 3의 1승 = 3
		
		// 연습)n을 입력받아 아래 수식의 결과를 출력하는 프로그램을 작성
		// 2^1 + 4^3 + 6^5 + ... + 2N^(2n-1)
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int i;
		
		double sum = 0;
		
		while(N <= 12) {

			for(i = 1; i < 13; i++) {
				if(i % 2 != 0)
				continue;
			
				sum += Math.pow(i*2, i);			
			}
		}
		System.out.println(sum);
		
	}
}
		
		
		
/*		
		System.out.print("N의 값을 입력하세요 : ");
		System.out.print("N의 값 : ");
		System.out.print("합계 : ");
		*/


