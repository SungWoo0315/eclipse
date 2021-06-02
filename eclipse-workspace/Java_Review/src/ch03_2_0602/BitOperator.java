package ch03_2_0602;

public class BitOperator {

	public static void main(String[] args) {
		//비트 논리 연산자.
		//값의 각각의 비트에 대해서 &, |. ^, ~

		// & 연산
		int num1 = 5;
		int num2 = 10;
		System.out.println( "5: " + Integer.toBinaryString(num1));
		System.out.println( "10: " + Integer.toBinaryString(num2));
		System.out.println(" 5 & 10: " + Integer.toBinaryString(num1 & num2));
		
		System.out.println(" 5 | 10: " + Integer.toBinaryString(num1 | num2));
		System.out.println(" 5 ^ 10: " + Integer.toBinaryString(num1 ^ num2));
		System.out.println(Integer.toBinaryString(~num2));
		
		System.out.println("============");
		
		int num3 = 6;
		int num4 = 10;
		System.out.println( "6: " + Integer.toBinaryString(num3));
		System.out.println( "10: " + Integer.toBinaryString(num4));
		System.out.println(" 6 & 10: " + Integer.toBinaryString(num3 & num4));
		
		System.out.println(" 6 | 10: " + Integer.toBinaryString(num3 | num4));
		System.out.println(" 6 ^ 10: " + Integer.toBinaryString(num3 ^ num4));
		
		System.out.println(Integer.toBinaryString(~num4));
		//논리 연산 num1 && num2; // 참 거짓: true, fasle
		
		
		
		// 논리비트 복합: &=, |=, ^=
		int num5 = 0;
		num5 &= num1;
		System.out.println( ": " + Integer.toBinaryString(num5));
		num5 |= num2;
		System.out.println( ": " + Integer.toBinaryString(num3));
		num5 ^= num2;
		System.out.println( ": " + Integer.toBinaryString(num3));
		
		System.out.println("--------------------");
		
		// 비트 이동.
		// 객체 << 이동횟수, 객체 >> 이동횟수
		
		System.out.println( "6 << 2 = " + Integer.toBinaryString(6 << 2));
		System.out.println( "6 >> 2 = " + Integer.toBinaryString(6 >> 2));
		
		
		System.out.println("============ 85p 비트이동 ============");
		num2 = 0B00000101; //5를 2진수로..
		System.out.println(" 5 << 2 = " + Integer.toBinaryString(num2 << 2));
		System.out.println(" 5 >> 2 = " + Integer.toBinaryString(num2 >> 2));
		System.out.println(" 5 >>> 2 = " + Integer.toBinaryString(num2 >>> 2));
		
		
		
		System.out.println( "5 >>> 2 = " + (1+1) );
		
		
		
		
		
		
//		int num1 = 100;
//		num1 += 2; // num1 = num1 + 2
//		System.out.println("+=: " + (num1 += 2) );
//		System.out.println("+=: " + num1);
//			
//		System.out.println("-=: " + (num1 -= 2));
//		System.out.println("*=: " + (num1 *= 2));
//		System.out.println("/=: " + (num1 /= 2));
	}

}
