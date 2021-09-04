package com.java.homework;

import java.util.Scanner;

public class HomeWork22 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num1;
		int num2;
		String oper;

		
		System.out.println("피연산자를 입력하세요.");
		num1 = scan.nextInt();
		
		System.out.println("연산자를 입력하세요.");
		oper = scan.next();
		
		System.out.println("피연산자를 입력하세요.");
		num2 = scan.nextInt();
		
		

		switch(oper) {
		
		case "+":
			System.out.println("계산결과 : " + (num1 + num2) + "입니다.");
			break;
			
		case "-":
			System.out.println("계산결과 : " + (num1 - num2) + "입니다.");
			break;
			
		case "*":
			System.out.println("계산결과 : " + (num1 * num2) + "입니다.");
			break;	
		
		case "/":
			System.out.println("계산결과 : " + (num1 / num2) + "입니다.");
			break;	
		}
		
	}

}
