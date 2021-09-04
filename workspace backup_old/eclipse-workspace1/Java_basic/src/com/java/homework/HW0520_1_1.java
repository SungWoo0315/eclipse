package com.java.homework;

import java.util.Scanner;

public class HW0520_1_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("자연수 n을 입력하시오.");
		int n = sc.nextInt();
		int cnt = 0;
		int sum = 0;
		int i = -1;
		while (true) {
			if (sum>=n) {
				break;
			}
			i = i+2;
			sum = sum + i;
			cnt++;
		}
		System.out.println("홀수의 개수 : " + cnt);
		System.out.println("합 : " + sum);
	}

}
