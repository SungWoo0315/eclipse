package com.java.homework;

public class HomeWork_123p_Q1_Switch {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;
		char operator = '+';
		
		switch(operator) {
		
		case '+' :
				System.out.println("+결과입니다." + (num1 + num2));
				break;
				
		case '-' :
				System.out.println("-결과입니다." + (num1 - num2));
				break;
				
		case '*' :
				System.out.println("*결과입니다." + (num1 * num2));
				break;
				
		default  : 
				System.out.println("/결과입니다." + (num1 / num2));
			
		}
		
		

	}

}