package kr.java.chapter07;

import java.util.Scanner;

public class ArrayQuiz1 {

	public static void main(String[] args) {
		// 다음 같은 정수 배열을 "," 구분자로 입력 받는다. 그리고 그 중에서 가장 큰 수를 찾는 프로그램을 작성
		// [-12, 3, -9, 5, 8, -2, 0, -8, 10]
		
		//Scanner sc = new Scanner(System.in);
		
		// 첫 번째 수에서 두 번째 수와 대비했을 때 큰 값을 살리면서 계산
				//[0] ~[9] 길이 10 배열
		
		
		// 오세황, 강명진 깃헙자료 참고
		
		int[] data = {-12, 3, -9, 5, 8, -2, 0, -8, 3, 10};		
				
		int big = data[0];
				
		for(int i = 0; i < data.length; i++) {
			if((i+1) == data.length) break;
			if(big <= data[i+1])
				big = data[i+1];
		}
		System.out.println("Big : " + big);
		}
}
