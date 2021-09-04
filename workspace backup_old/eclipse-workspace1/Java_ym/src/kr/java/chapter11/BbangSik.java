package kr.java.chapter11;

import java.util.Scanner;

public class BbangSik {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// 1~100사이의 숫자를 입력하면, 입력한 숫자부터 100까지의 합을 구함
		System.out.println("1~100 사이의 숫자를 입력하세요.");
		
		int sum = 0;
		int num = sc.nextInt();
		int i;
		
		for ( i = num; num <= 100; num++ ) {
			sum += num;
		}
		System.out.println(sum);

	}

}
