package com.java.homework;

import java.util.Scanner;

public class HW0520_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("자연수 n을 입력하시오.");
		
		int n = sc.nextInt();
		int hol = 1;
	
		for (int i = 0; i < n; i++) {
		
			for (int j = 0; j < n; j++) {
					System.out.print(hol + " ");
					hol = (hol+2)%10;
			}	
			System.out.println();
		}	
	 }
}