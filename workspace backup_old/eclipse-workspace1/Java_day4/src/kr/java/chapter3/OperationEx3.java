package kr.java.chapter3;

public class OperationEx3 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		System.out.println( a > b );
		System.out.println( a < b );
		System.out.println( a >= b );
		System.out.println( a <= b );
		
		System.out.println( 0 == b );
		System.out.println( -1 == b );
		
		boolean b1 = ( a > b );
		System.out.println( b1 );
		
		
		System.out.println( ( 5 > 3 ) && ( 5 > 2)); // 논리곱 && 두 항이 모두 참이 경우 true
		System.out.println( ( 5 > 3 ) || ( 5 > 2)); // 논리합 하나만 참이면 참, 둘 다 거짓이면 거짓
//		System.out.println!(5 > 3); ??????
		
		int num1 = 100;
		
		System.out.println(num1 + ", " + (num1 += 2));
		
	}

}
