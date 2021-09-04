package hello;

public class SizeOfTypes {

	public static void main(String[] args) {
		// byte -> Byte
		System.out.println("byte 크기: " + (Byte.SIZE/8) + "Bytes"); // primitive type 마다 클래스 크기 정의가 있다.
		// Int -> Integer
		// Short -> Short
		// Long
		// Character
		// Float
		// Double

		System.out.println("Int 크기: " + (Integer.SIZE/8) + "Bytes");
		
		System.out.println("Short 크기: " + (Short.SIZE/8) + "Bytes");
		
		System.out.println("Long 크기: " + (Long.SIZE/8) + "Bytes");
		
		System.out.println("Char 크기: " + (Character.SIZE/8) + "Bytes");
		
		System.out.println("Float 크기: " + (Float.SIZE/8) + "Bytes");
		
		System.out.println("Double 크기: " + (Double.SIZE/8) + "Bytes");
	
		
		// 책 49p 실습.
	}

}
