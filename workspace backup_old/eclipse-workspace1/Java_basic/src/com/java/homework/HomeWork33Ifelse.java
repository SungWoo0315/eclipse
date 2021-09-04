package com.java.homework;

import java.util.Scanner;

public class HomeWork33Ifelse {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String weight;
		int height;
		String ch;
		
	while(true)	{	
		
		System.out.println("몸무게를 입력하세요.");
		weight = scanner.next();
		
		if(weight.equals("-1") || weight.equals("q")) {
			System.out.println("종료합니다...");
			break;
		}
		
		System.out.println("키를 입력하세요.");
		height = scanner.nextInt();
		
		// if - else 를 사용하였습니다.
		if( Integer.parseInt(weight) + 100 - height > 0) {
			System.out.println("비만수치 비만");
		}
		else {
			System.out.println("정상입니다.");
		}
			
	}	
	  System.out.println("종료");
	}

}
