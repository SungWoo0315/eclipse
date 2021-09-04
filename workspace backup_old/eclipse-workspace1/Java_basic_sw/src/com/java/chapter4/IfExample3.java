package com.java.chapter4;

import java.util.Scanner;

public class IfExample3 {

	public static void main(String[] args) {
		// 예제] pdf 자바 기본프로그래밍
		//숫자를 입력받아
		//숫자가 0보다 크면 “양수” 영보다 작으면 “음수” 0일때는 “0입니다.”을 출력하세요
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(" 숫자를 입력하세요 :  ");
		String str = scanner.nextLine( );
		
		int num1 = Integer.parseInt(str);
		
		if ( num1 > 0 ) {
			System.out.println("양수");
		}
		else if ( num1 < 0 ) {
			System.out.println("음수");
		}
		else {
			System.out.println("0입니다.");
		}
	}
}
