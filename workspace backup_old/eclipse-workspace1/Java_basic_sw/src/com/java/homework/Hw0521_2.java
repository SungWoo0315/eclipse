package com.java.homework;

import java.util.Scanner;

public class Hw0521_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	

		System.out.println("정수를 입력하시오.");
		
		int[] arr = new int[100];

		for(int i=0;i<arr.length;i++) {

			arr[i] = sc.nextInt();

			if(arr[i] == 0)

				break;

		}

		System.out.println("'0' 을 입력하여 종료합니다.");

		for(int i=arr.length-1;i>=0;i--) {

			if(arr[i]!=0)
				

			System.out.print(arr[i]+" ");

		}
		
	}

}