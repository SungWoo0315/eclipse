package kr.java.chapter07;

import java.util.Scanner;

public class HomeWork02 {

	public static void main(String[] args) {
		// 자연수 n을 입력받아 "출력 예"와 같이 n x n 크기에 공백으로 구분하여 출력되는 프로그램을 작성하시오.
		// 10 미만의 홀수만 출력하시오.
		// 주의! 숫자는 공백으로 구분하되 줄사이에 빈줄은 없다.
		
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] MultiArray = new int[][];
	
		
		
		
		System.out.println("숫자를 입력하세요.");
		
				
		for(int i=0; i < MultiArray.length; i++ ) {
			//if( i %2 == 0 ) {
			//	continue;
			//}
			for(int j=0; j < MultiArray.length; j++) {
				System.out.println("("+i+","+j+")="+ MultiArray.length);
			}
			System.out.println( );
		}
		//System.out.println(MultiArray.length);
		//System.out.println(MultiArray[0].length);
		//System.out.println(a + " " + b + " " + c);
		//System.out.println(d + " " + e + " " + f);
		//System.out.println(g + " " + h + " " + i);
		
		

	}

}
