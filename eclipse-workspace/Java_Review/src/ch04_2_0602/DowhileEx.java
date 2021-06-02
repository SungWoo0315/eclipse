package ch04_2_0602;

import java.util.Scanner;

public class DowhileEx {

	public static void main(String[] args) {
		
		System.out.println("메시지를 입력하세요.");
		System.out.println("프로그램을 종료하려면 q를 입력하세요.");

		Scanner scanner = new Scanner(System.in);
		String inqutString;
		
		do {
			System.out.println(">");
			inqutString = scanner.nextLine();
			System.out.println(inqutString);
			
		} while( ! inqutString.equals("q"));
		
		System.out.println();
		System.out.println("프로그램 종료");
	}

}
