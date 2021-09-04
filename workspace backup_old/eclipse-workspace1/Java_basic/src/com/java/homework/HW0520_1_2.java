package com.java.homework;

import java.util.Scanner;

public class HW0520_1_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
	while(true)	{
		System.out.println("자연수 n을 입력하시오.");
		int n = sc.nextInt();
		
		for(int i = 0; i<n; i++) {
			for(int j = 1; j<=i; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j<=(n-i)*2-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=2; i > 0; i-- ) {
			for(int j = 2; j<=i; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<=(n-i)*2; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}	

  }

}
