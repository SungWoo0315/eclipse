package chapter3;

public class test2 {

	public static void main(String[] args) {
		// 책 76p
		
		int a = 10;
		int b = 20;
		
		System.out.println(a > b);
		System.out.println(a < b);
		System.out.println(a >= b);
		System.out.println(a <= b);
		
		System.out.println(0 == b);
		System.out.println(-1 == a);
		
		System.out.println("----------------");
		// 위의 코드들을 축약하면 아래와 같음.
		boolean b1 = (a > b);
		System.out.println( b1 );  
		
		System.out.println( (5 > 3) && ( 5 > 2));
		System.out.println( (5 > 3) || ( 5 > 2));
		
		System.out.println("-------------------");
		
		
		int num1 = 10;
		int num2 = 20;
		
		boolean flag = (num1 > 0) && (num2 > 0);
		System.out.println(flag);
		
		flag = (num1 <0) && (num2 >0);
		System.out.println(flag);
		
		flag = (num1 < 0) || (num2 > 0);
		System.out.println(flag);
		
		System.out.println("-------------------");
		
		int num5 = 100;
		
		System.out.println( num5 + ", " + (num5 += 2) );
	}

}
