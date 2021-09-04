package com.java.homework;

import java.util.Iterator;
import java.util.Scanner;

public class Hw0521_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("자연수 n을 입력하시오.");
		
		int a = sc.nextInt();
		char ch = 'A';
		int b = 1;
		
		for (int i = 0; i < a; i++) {
			if((a < 3) || (a > 10)) {
				System.out.println("벗어난 숫자입니다.");
				break;
			}
			
			for (int j = 0; j > i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= a-i-1; j++) {
				if(ch == 'Z' +1) ch = 'A' ;
				System.out.print(ch++);
			}
			System.out.println();
		}

	}

}
