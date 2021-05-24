package com.java.homework;

import java.util.Scanner;

public class HomeWork_String {

	public static void main(String[] args) {
		// 사칙연산 계산기 개선
		// 사칙연산을 scanner 입력으로 구현.
		// "1+1" 같이 입력받아 결과를 출력.
		// 예) 계산식을 입력하세요 
		// 1+1
		// 2
			Scanner scan = new Scanner(System.in);
			
			
	  while(true) {	
			System.out.println("계산식을 입력하세요.");
			String op = scan.nextLine();
			
			String[] sik = op.split(" ");
			
			for (int i=0; i<sik.length; i++) {
				System.out.print(sik[i]+" ");
			}
			
			int num1=Integer.parseInt(sik[0]);
			
			int num2=Integer.parseInt(sik[2]);
			
			System.out.println( );
			
			switch(sik[1]) {
			
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
			// 다시 복습해보기.
		}
	  }
	}
