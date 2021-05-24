package hello;

public class BooleanEx {

	public static void main(String[] args) {
		boolean isMarried = true;		//boolean 변수를 선언하고 초기화
		System.out.println(isMarried);
		
		//교재 59p
		
		System.out.println("--------------------");
		
		boolean b1 = false;
		boolean b2 = true;
		
		System.out.println("Is true: " + true);
		System.out.println("Is false: " + false);

		b1 = b2;
		System.out.println("b1: " + b1);
		
		
//		i1 = (int) b1;
//		b1 = (boolean) i1;
		
//		byte bt =1;
//		b1 = (boolean)bt;
		
//		System.out.println("b1 <> int " + (int)b1);
		
		//논리적인것이기 때문에 정수로 허용 안한다.
		
		
		
		
		// 값 변경이 안되는 식별자! (변수) => 상수 Constant.
		// 값이 미리/기/사전에 선언을하고 사용하는 목적!
		
		final double PI = 3.14;
		final double PI2 = 3.14;
		
//		1000L; 롱형 리터럴
//		3.14F; float형 
//		'A';
//		1234;
//		true;
//		false;
				// 위의것이 다 리터럴.
		
		
	}

}
