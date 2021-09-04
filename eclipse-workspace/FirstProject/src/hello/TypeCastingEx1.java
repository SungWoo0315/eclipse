package hello;

public class TypeCastingEx1 {

	public static void main(String[] args) {
		// 1. 암묵적 타입캐스팅.
		// 파충류 파1 = 고릴라1;
		
		byte b = 25;  // 1바이트
		short s = b;  // 2바이트
		int i = s;    // 4바이트
		long l = i;   // 8바이트
		// 실수
		float f = i;
		double d = f;
		
		// 2. 명시적 타입캐스팅.
		byte b1 = (byte)256;
		// 명시적
		// 파충류 파1 = (파충류)고릴라1;
		
		System.out.println("b = " + b);
		System.out.println("s = " + s);
		System.out.println("i = " + i);
		System.out.println("l = " + l);
		
		System.out.println("f = " + f);
		System.out.println("d = " + d);
		
		System.out.println("b1 = " + b1);
		
		
		
		
		
		
	}

}
