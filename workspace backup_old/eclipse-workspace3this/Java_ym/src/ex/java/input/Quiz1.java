package ex.java.input;

import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println(" a입력 : ");
		String a = scanner.nextLine( );
		System.out.println(" b입력 : ");
		String b = scanner.nextLine( );
		System.out.println(" c입력 : ");
		String c = scanner.nextLine( );
		
		
		System.out.println(a + b + c);
		System.out.println((a + b + c) / 3);
	}

}
