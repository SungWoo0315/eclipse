package kr.java.chapter11;

import java.util.Scanner;

public class Homework0521_1 {

	public static void main(String[] args) {
		// 자연수 n (3<=n<=10)을 입력받아 다음과 같이 영문자를 출력
		// ex) 3 입력 
		// ABC
		// DE 
		// F
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.(3이상 10이하)");
		
		int n = sc.nextInt();
		int i, j;
		char ch = 'A';
		
		
		if (n < 3 || n > 10) {
			System.out.println("잘못된 범위의 입력입니다.");
			return;
		}
		for ( i = n; i > 0; i-- ) {
			for ( j = i; j > 0; j--) {
				System.out.print(ch);
				ch++;
			}
			System.out.println();
		}
		
		

	}

}
