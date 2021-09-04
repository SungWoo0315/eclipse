package com.java.chapter4;

import java.util.Scanner;

public class IfScannertest {

	public static void main(String[] args) {
		
		// 실습2 day4 실습 + 조건문
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(" 숫자를 입력하세요 :  ");
		String str = scanner.nextLine( );
		
		int num1 = Integer.parseInt(str);
		
		if ( ( num1 == 0 ) || ( num1 < 0 ) ) {
			System.out.println("안녕~");
		}
		
		else {
			choiceOperation(scanner);
		
		}
	}

	private static void choiceOperation(Scanner scanner) {
		
		System.out.println(" 숫자를 입력하세요 :  ");
		String str = scanner.nextLine( );
		
		int num1 = Integer.parseInt(str);
		
		if ( ( num1 == 0 ) || ( num1 < 0 ) ) {
			System.out.println("안녕~");
		}
		
		else {
			choiceOperation(scanner);
	}
}
}