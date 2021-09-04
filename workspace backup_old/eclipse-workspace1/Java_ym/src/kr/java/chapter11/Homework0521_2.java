package kr.java.chapter11;

import java.util.Scanner;

public class Homework0521_2 {

	public static void main(String[] args) {
		// 100개의 정수를 저장할 수 있는 배열을 선언
		// 정수를 차례로 입력받다가 0이 입력되면 0을 제외하고
		// 그때까지 입력된 정수를 역순으로 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요.(100개까지 입력 가능)\n0을 입력하면 역순으로 출력됩니다.");
		
		int[] num = new int[100]; // 100개까지 입력할 수 있는 배열 선언
		int i; // 배열 인덱스 설정을 위한 정수형
		
		for (i = 0; i < num.length; i++) { // 인덱스 i를 0으로 초기화한 상태에서, 인덱스값이 num 배열 개수보다 작으면 인덱스++
			System.out.println("수를 입력하세요.");
			num[i] = sc.nextInt();  // 처음 입력한 정수가 0번 인덱스에 할당, num[0] = 입력값  
			if (num[i] == 0) break; //  num[0] == 0이면, 수행문 종료.
		}
		for (i = num.length-1; i>=0; i--) { // 인덱스값이 배열 길이-1과 같다고 초기화, 인덱스값이 0보다 크거나 같으면 인덱스--
			if (num[i] != 0) { //  인덱스 값이 0이 아니면, 아래 수행문 진행
				System.out.print(num[i] + " ");
			}
		}
		
		
		
		
		

	}

}
