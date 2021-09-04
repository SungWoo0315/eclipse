package com.java.chapter3;

public class BitOperation2 {

	public static void main(String[] args) {
		/** Shift operator
		 * bit wise operation
		 *  -left, rigth, 채움
		 */

		int n1 = 5;
		int n2 = -5;
		
		System.out.println("5 << 2 = " + (n1 << 2) ); //
		System.out.println("5 << 3 = " + (n1 << 3) );
		
		System.out.println("5 >> 1 = " + (n1 >> 1) );
		System.out.println("5 >> 2 = " + (n1 >> 2) );
		System.out.println("5 >> 3 = " + (n1 >> 3) );
		
		System.out.println("--------------------");
		
		System.out.println("-5 << 2 = " + (n2 << 2) ); //
		System.out.println("-5 << 3 = " + (n2 << 3) );
		
		System.out.println("-5 >> 1 = " + (n2 >> 1) );
		System.out.println("-5 >> 2 = " + (n2 >> 2) );
		System.out.println("-5 >> 3 = " + (n2 >> 3) );
		
		System.out.println("--------------------");
		
		System.out.println("5 >>> 2 = " + (n1 >>> 2) ); //
		System.out.println("5 >>> 3 = " + (n1 >>> 3) );
		
		System.out.println("5 >>> 1 = " + (n1 >>> 1) );
		System.out.println("5 >>> 2 = " + (n1 >>> 2) );
		System.out.println("5 >>> 3 = " + (n1 >>> 3) );
		
		System.out.println("--------------------");
		// 비트단위로 출력한 결과 값.
		System.out.println("5 >>> 1 = " + Integer.toBinaryString(n1 >>> 1) );
		System.out.println("-5 >>> 1 = " + Integer.toBinaryString(n2 >>> 1) );

		
		
		
	}

}
