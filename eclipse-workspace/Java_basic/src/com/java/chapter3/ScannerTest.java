package com.java.chapter3;

import java.util.Scanner;  //일일이 치지말고 Scanner에서 입력.

public class ScannerTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); // Scanner는 기본패키지에 들어있지 않음.
		// new를 써서 Scanner 클래스 생성. ()안에 매개변수 넣음.
		
		
		// java.lang : 패키지 -> 기본패키지에 String같은것.
		// chapter11 기본클래스. 읽어보기
		
		System.out.println("이름:");
		String name = scanner.nextLine( ); // 입력하여 엔터친 문자를 반환.
		System.out.println("직업:");
		String job = scanner.nextLine( ); 
		System.out.println("사번:");
		int num = scanner.nextInt();
		
		System.out.println(name);
		System.out.println(job);
		System.out.println(num);
		
	}

}
