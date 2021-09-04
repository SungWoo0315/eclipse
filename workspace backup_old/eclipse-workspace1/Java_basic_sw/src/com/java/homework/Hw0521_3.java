package com.java.homework;

import java.util.Scanner;

public class Hw0521_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("자연수 n을 입력하시오.");
		
		int a = sc.nextInt();
		
		
		for (int i = 0; i < a; i++) {
			int b = 1;
			for (int j = 0; j < a-1-i; j++) {
				System.out.print("  ");
			}
			for (int j = 0; j < i+1; j++) {
				System.out.print(b++ + " ");
			}
			System.out.println();
		}

	}

}
