package kr.java.chapter11;

import java.util.Scanner;

public class StringEx1 {

	public static void main(String[] args) {
		// 숫자 n 값을 입력받아 1부터 n까지 소수를 구하는 프로그램을 작성
		// 1에서 n까지 소수 출력
		// 1보다 큰 자연수 중 1과 자기 자신만을 약수로 가지는 수
		// 5는 1이랑 5로만 만들 수 있는 결과값. 6은 2x3으로도 되니까 소수가 아님
		// 조건은 1부터 100까지의 수에서 소수를 찾는법
		// regex 문자열을 구분하기 위한 정규 표현
		
		
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int i = 2; // i : 나눌 대상
		
		boolean isPrime = true;
		
		while (i <= num) {
			
			isPrime = true;
			
			for(int n = 2; n < i; n++) {
				
				if (i % n == 0) {
					isPrime = false;
				continue;
				}
			}
			
			if(isPrime == true) { 
				System.out.println(i);
			i++;
			}
		}
		System.out.println("");
		

		
/*		
		while(true) {
			int count = 0;
			System.out.println("첫 번째 수 입력하세요.");
			int num = sc.nextInt();
			
			if(num < 1) {
				System.out.println("1보다 큰 수를 입력하세요.");
				continue;
			}
			for(int i = 1; i<=num; i++) {
				if(num %1 == 0) {
					count++;
				}
				
			}
			if(count == 2) {
				System.err.println("소수입니다.");
			}
			else {
				System.out.println("소수가 아닙니다.");
			}
		}
		*/

	}

}
