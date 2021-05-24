package com.java.ex_ing;

import java.util.Scanner;

public class ArrayTestDogName {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] krdog = {"곰돌이","복돌이","흰둥이","깨소금","까만콩"};		
		String[] endog = {"Bear","Gift","White","Sesami","Black"};
		
		System.out.println("애완견 이름을 적어주세요.");	
		String name = sc.nextLine();
		
		for (int i = 0; i < 5; i++) {
			
			if(name.equals(krdog[i])) {
				System.out.println("> " + endog[i]);
				break;
			}
//			else {
//				System.out.println("미등록");
//				break;
//			}
//				else가 있으면 제대로 나오지 않아서 블록처리.
			}
		}
		
	}