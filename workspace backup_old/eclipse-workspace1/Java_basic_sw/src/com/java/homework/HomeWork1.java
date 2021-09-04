package com.java.homework;

import java.util.Scanner;

public class HomeWork1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(" 점수를 입력하세요 :  ");
		String str = scanner.nextLine( );
		
		int score = Integer.parseInt(str);
		
		
		//int score = 50;
		char grade = 0;
		
		if(score >= 90) {
			grade = 'A';
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

