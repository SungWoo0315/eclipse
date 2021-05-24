package com.java.homework;

import java.util.Scanner;

public class Test_Test {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요. ");
		int num = scan.nextInt();
		
		int odd = 1;
		for(int i=0; i<num; i++) {
			for(int j=0; j<num; j++) {
				System.out.print(odd+" ");
				odd += 2;
				if(odd>10) odd=1;
			}
			System.out.print("\n");
		}

	}

}
