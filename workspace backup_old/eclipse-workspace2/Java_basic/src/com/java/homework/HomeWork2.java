package com.java.homework;

import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	while(true) {	
		System.out.println(" 층수를 입력하세요 :  ");
		String floor = scanner.next( );
					
		// 숫자로 받으려면 int floor = sc.nextInt(); 하고 숫자로 ..
		
		
		switch(floor) {
			case "1층": // 숫자로 1만 적으면 됨.
				System.out.println("1층 약국입니다.");
				break;
			case "2층":
				System.out.println("2층 정형외과입니다.");
				break;
			case "3층":
				System.out.println("3층 피부과 입니다.");
				break;
			case "4층":
				System.out.println("4층 치과 입니다.");
				break;
			case "5층":
				System.out.println("5층 헬스클럽 입니다.");
				break;
			default: //예외사항을 지정하였을 때 default를 사용한다.
				System.out.println("해당하지 않는 층입니다.");
				break;
		}
	 }	

  }

}
