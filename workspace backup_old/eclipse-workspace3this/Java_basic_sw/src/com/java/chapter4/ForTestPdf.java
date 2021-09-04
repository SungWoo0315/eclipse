package com.java.chapter4;

import java.util.Scanner;

public class ForTestPdf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int dan;
		//int i = 1;
		
		System.out.println("단을 입력해 주세요.");
		dan = sc.nextInt( );
		
		for ( int i = 1; i < 10; i++ ) {
			System.out.println( dan + " * " + i + " = " + i * dan );
			
			// i++;
		}
	}

}
