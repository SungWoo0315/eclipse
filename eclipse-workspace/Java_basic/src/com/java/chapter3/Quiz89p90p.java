package com.java.chapter3;

public class Quiz89p90p {

	public static void main(String[] args) {
		
		int num;
		num = -5 + 3 * 10 / 2;
		System.out.println(num);
		
		System.out.println("-------------");
		
		int num11 = 10;
		
		System.out.println(num11);
		System.out.println(num11++);
		System.out.println(num11);
		System.out.println(--num11);
		
		System.out.println("-------------");
		
		int num1 = 10;
		int num2 = 20;
		boolean result;
		
		result = ((num1 > 10) && (num2 > 10));
		System.out.println(result);
		result = ((num1 > 10) || (num2 > 10));
		System.out.println(result);
		System.out.println(!result);
		
		System.out.println("-------------");
		
		int num22 = 2;
		int num33 = 10;
		
		System.out.println(num22 & num33);
		System.out.println(num22 | num33);
		System.out.println(num22 ^ num33);
		System.out.println(~num22);
		
		System.out.println("-------------");
		
		int num44 = 8;
		
		System.out.println(num44 += 10);
		System.out.println(num44 -= 10);
		System.out.println(num44 >>= 2);
		
		System.out.println("-------------");
		// 3항 연산자 81p 참고.
		int num77 = 10;
		int num88 = 20;
		
		int result77 = (num77 >= 10) ? num88 + 10 : num88 - 10;
		System.out.println(result77);
		
		System.out.println("-------------");
		
	}

}
