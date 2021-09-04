package com.java.homework;

public class HomeWork_123p_Q1_If {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;
		
		char operator = '+';
				
				if(operator == '+') {
					System.out.println("+의 결과입니다." + (num1 + num2));
				}	
				else if(operator == '-' ) {
					System.out.println("-의 결과입니다." + (num1 - num2));
				}
				else if(operator == '*' ) {
					System.out.println("*의 결과입니다." + (num1 - num2));
				}
				else {
					System.out.println("/의 결과입니다." + (num1 / num2));
				}
		}
	}