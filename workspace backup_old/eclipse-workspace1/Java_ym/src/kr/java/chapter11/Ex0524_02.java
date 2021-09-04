package kr.java.chapter11;

import java.util.Arrays;
import java.util.Scanner;

public class Ex0524_02 {

	public static void main(String[] args) {
		// 애완견 이름 곰돌이, 복돌이, 흰두잉, 깨소금, 까만콩
		// Scanner와 array를 사용해 매칭되는 문자열 출력
		// 애완견 이름이 입력되면 아래와 같이 변환하여 출력
		// 곰돌이 bear 복돌이 Gift 흰둥이 White 깨소금 Sesami 까만콩 Black
		
		Scanner sc = new Scanner(System.in);
		
		String[] dogs = {"곰돌이","복돌이","흰둥이","깨소금","까만콩"};
		String[] name = {"Bear","Gift","White","Sesami","Black"};
		
		System.out.println("애완견 이름을 입력해주세요.");
		String str = sc.nextLine();		
		
		int i = Arrays.asList(dogs).indexOf(str);
		
		if ( i == -1) {
			System.out.println("존재하지 않는 이름입니다.");
			return;
		}	
		System.out.println(name[i]);
		
	}

}
