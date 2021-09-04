package kr.java.chapter11;

import java.util.Scanner;

public class Homework0521_3 {

	public static void main(String[] args) {
		// 자연수 n을 입력받아 공백으로 구분하여 출력
		// 주의! 숫자를 공백으로 구분하되, 줄 사이에 빈 줄은 없다.
		// ex) 3 입력
		//   1
		//  12
		// 123
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("자연수를 입력하세요.");
		
		int i, j;
		int num = sc.nextInt();
		
		
		for (i = 0; i < num; i++) {
			System.out.println(name[i]);
		}
		
		
		

	}

}
