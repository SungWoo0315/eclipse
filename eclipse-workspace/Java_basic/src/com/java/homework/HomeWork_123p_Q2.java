package com.java.homework;

public class HomeWork_123p_Q2 {

	public static void main(String[] args) {
		
		int dan;
		int times;
		
		for ( dan = 1; dan < 10; dan++ ) {	
			
			System.out.println(dan + ": " + (dan % 2));//출력값을 확인.
			
			if(dan % 2 == 1)	//홀수인 경우 다시 for문으로 감.
				continue;
			
			for ( times = 1; times < 10; times++ ) {
				
				System.out.println( dan + " * " + times + " = " + times * dan );
			}
			System.out.println( );
		}

	}
}