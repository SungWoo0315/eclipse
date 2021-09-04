package com.java.chapter3;

import java.util.Scanner;

public class Scanner2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println(" a입력 : ");
		String num1 = scanner.nextLine( );
		System.out.println(" b입력 : ");
		String num2 = scanner.nextLine( );
		System.out.println(" c입력 : ");
		String num3 = scanner.nextLine( );
		
		int a = Integer.parseInt(num1);
		int b = Integer.parseInt(num2);
		int c = Integer.parseInt(num3);
		
		System.out.println("합산 : " + (a + b + c));
		System.out.println("평균 : " + ((a + b + c)/3));
	}

}
