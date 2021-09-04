package com.java.homework;

import java.util.Scanner;

public class HomeWork1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
	while(true) {	
		System.out.println(" 점수를 입력하세요 :  ");
		String str = scanner.nextLine( );
		
		int score = Integer.parseInt(str);
		
		
		//int score = 50;
		char grade = 0;
		//String 도 가능함.
		//String grade = new String();
		//String grade = ""; 초기화를 해야 한다.
		
		if(score >= 90) {
			grade = 'A'; //String으로 했을 시 "A"
			System.out.println("100~90점 입니다.");
		}
		else if(score >= 80) {
			grade = 'B';
			System.out.println("89~80점 입니다.");	
		}
		else if(score >= 70) {
			grade = 'C';
			System.out.println("79~70점 입니다.");	
		}
		else if(score >= 60) {
			grade = 'D';
			System.out.println("69~60점 입니다.");
		}
		else {
			grade = 'F';
		}
				
		
		System.out.println("학점은 " + grade + " 입니다.");
	}
  }
}
