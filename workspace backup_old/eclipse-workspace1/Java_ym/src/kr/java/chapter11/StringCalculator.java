package kr.java.chapter11;

import java.util.Scanner;

public class StringCalculator {

	public static void main(String[] args) {
		// string 이용하여 사칙연산 계산기 개선
		Scanner sc = new Scanner(System.in);
		
		System.out.println("계산식을 입력하세요 : ");
		String op = sc.nextLine();
		
		String[] num = op.split(" ");
		
		for(int i= 0; i<num.length; i++) {
			System.out.print(num[i] + " ");
		}
		
		
		int num1 = Integer.parseInt(num[0]);
		int num2 = Integer.parseInt(num[2]);
		
		System.out.println();
		
		switch(num[1]) {
			case "+":
				System.out.println(num1 + num2);
				break;
			case "-":
				System.out.println(num1 - num2);
				break;
			case "*":
				System.out.println(num1 * num2);
				break;
			case "/":
				System.out.println(num1 / num2);
				break;
			default:
				System.out.println("잘못된 계산입니다.");
				break;
		}
		System.out.println("값 : " + num1 +  + num2);
		
	}

}
