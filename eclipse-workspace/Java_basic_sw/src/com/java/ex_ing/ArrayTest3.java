package com.java.ex_ing;

public class ArrayTest3 {

	public static void main(String[] args) {
		
		// 숫자를 100개 담는 배열
		// 배열은 크기를 정해 놓는것.
		// 장점 : 정해진 메모리 할당을 받을수 있음.
		// 단점 : 동적배열방식으로는 시간이 많이 걸릴 수 있음.
		
		int[] array = new int[100]; 
		int array1[] = new int[100];
		
		//
		
		/**
		int[] array2;
		
		while(true) {
			
			array2 = new int[100];
			
			for(int i = 0; i < 100; i++) {
				
			}
		}
		**/
		
		
		// 학생이름, 학번, 위치 정보를 100개 담은 자료를 선언하시오.
		// 예) "홍길동, 1020, 구로구" --> "홍길동 - 1020 - 구로구" 
		//		",", "-" : 구분자, Delimeter, 분리자 Sperator
		String[] info = new String[100];
		info[0] = "홍길동, 1020, 구로구";
		info[1] = "홍수달, 1021, 부산 기장구";
		// info[2] = "홍길동 - 1020 - 구로구"; <---정보표현에 두가지 구분자를 쓰면 안된다.
		
		
		for(int i = 0; i < info.length; i++) {
			String person = info[i];
			String[] data = person.split(",");
			System.out.println("이름: " + data[0]
					+ " 학번:" + data[1] 
					+ " 위치:" + data[2]);
			// 100개 메모리 설정 중, 98개가 비어 있어서 Exception null 에러가 나온다.
			
		}
		
		// 이름 : "홍길동"
		// 학번 : 1020
		// 위치 : 구로구
		
		String[] name = new String[100];
		String[] number = new String[100];
		String[] house = new String[100];
		name[0] = "홍길동"; number[0] = "1020"; house[0] = "시흥시";
		//name[1] = "이순신"; number[1] = "1030"; 
		//중간에 빠진 데이터(house)가 있으면 오류남.
		
		for(int i = 0; i < name.length; i++) {
			System.out.println("이름: " + name[i]
					+ " 학번:" + number[i] 
					+ " 위치:" + house[i]);
		}
		
		//
		String[] info2 = new String[] {"",""};
		//String[] info2 = {"",""};    위의것과 같은 것이다. (동적)
		
		//구조화해서 배열에 집에넣는것을 배운다.
	}

}