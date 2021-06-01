package ch02_4_0601;

public class ConstantLiteralMain {
	// 멤버필드
	
	
	public static void main(String[] args) {
		//지역변수
		
		final double PI = 3.14; // 한번 선언하면 고정. 고정된 숫자값을 주로 사용.
		
		System.out.println(PI);
		
//		PI = 3.141569; // final 때문에 요류가 나옴. 새로운 대입을 할 수 없음.
		
		float f = 1.0F;
		char c = 'A';
		int i = 1;
		long l = 1L;
		
		boolean b = true;
		
		// 문자열: char 배열 
		String s = "Hello";
		
	}

}
