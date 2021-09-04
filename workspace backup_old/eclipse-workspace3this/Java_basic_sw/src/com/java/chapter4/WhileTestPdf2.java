package com.java.chapter4;

import java.util.Scanner;

public class WhileTestPdf2 {

	public static void main(String[] args) {
		// pdf 실습 : for while2
		//앞의 구구단을 계속 입력 받도록 수정해 보자.
		//- 입력값이 -1 까지.
		//- while사용이 유리
		
			Scanner sc = new Scanner(System.in);
			
			int dan;
			
			while (true) {
				System.out.println("단을 입력해 주세요.");
				dan = sc.nextInt( );
				if( dan == -9 ) {
					System.out.println( "~끝~");
					break;
				}
				for(int i = 0; i < 10; i++) {
					System.out.println( dan + " * " + i + " = " + i * dan );
				}
				dan = 0;
			}
			
		}

	}