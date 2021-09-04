package com.java.homework;

import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(" 층수를 입력하세요 :  ");
		String str = scanner.nextLine( );
				
		String floor = str;
		
		
		switch(floor) {
			case "1층":
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
		}
		

	}

}
