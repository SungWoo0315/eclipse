package com.java.homework;

import java.util.Scanner;

public class HomeWork_String2 {

	public static void main(String[] args) {
		// 실습: 문자의 크기를 반환
		// 연습) 숫자 n 값을 입력받아 1부터 n까지 소수를 구하는 프로그램 작성.
		// 1에서 n까지 소수 출력.
		// 1보다 큰 자연수 중 1과 자기 자신만을 약수로 가지는 수다.
		// 예) 5는 1x5 또는 5x1로 수를 곱한 결과를 적는 유일한 방법이
		// 그 수 자신을 포함하기 때문에 5는 소수이다.
		// 그러나 6은 자신보다 작은 두 숫자(2x3)의 곱이므로 소수가 아니다.
		// 1과 그 수 자신 이외의 자연수로는 나눌 수 없는 자연수로 정의하기도 한다.
		
		 Scanner sc = new Scanner(System.in);
		
		 int num = sc.nextInt(); 
			
		int i = 2; // i : 나눌대상
		
		boolean isPrime = true;
		
		while (i <= num) {
			
			isPrime = true;
			
			for (int n = 2; n < i; n++) {
				
				if (i % n == 0) {
					isPrime = false;
				}
				continue;
			}
			
			if (isPrime == true) {
				System.out.print(i + " ");
			}
			i++;
		}
		System.out.println("");
		 //스크린샷 참고해서 다시 작성하기.
		
		
		
		/** Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=2; i<=n; i++) {
			boolean isPrime = true;
			
			for(int j=2; j*j<=i; j++) {
				if(i % j == 0) {
					isPrime = false;
					break;
				}
			}
			
			if(isPrime ) {
				System.out.println(i + "");
			}
		} **/  //인터넷 참조.

		/** Scanner scan = new Scanner(System.in);
		
		while(true) {
		int count=0;
		System.out.println(" 수 입력 하세요 ");
		int num = scan.nextInt();
		
		if(num < 1) {
			System.out.println("다시 입력하세요:");
			continue;
		}
		
		for(int i = 1;i<=num;i++) {
			
			if(num%i==0) {
				count++;
			}
			
		
		}
	
		
		if(count == 2) {
			System.out.println("소수입니다.");
		}else {
			System.out.println("소수아닙니다.");
		}
		
		
	
		} **/ //입력한 숫자가 소수인지 아닌지 확인하는 방식.
		
		/**Scanner sc=new Scanner(System.in);
		
		System.out.println("확인할 범위를 입력해주세요");
		int last=sc.nextInt();
	
		for(int i=2;i<=last;i++) {
			if(i!=2 && i%2==0) {
				
			}else if(i!=3 && i%3==0) {

			}else if(i!=5 && i%5==0) {

			}else if(i!=7 && i%7==0) {
				
			}else {
				System.out.print(i+" ");
			}
		} **/
		
	
	
	}

}
