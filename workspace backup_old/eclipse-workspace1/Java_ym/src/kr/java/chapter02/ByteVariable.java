package kr.java.chapter02;

public class ByteVariable {

	public static void main(String[] args) {
		// Byte형 : byte
		byte bs1 = -128;
//		byte bs2 = 128; // 범위
		// byte값은 (2^7)-1 = 128-1 = 127까지 입력 가능, 값이 0부터 시작되기 때문에
		// 음수는 -1부터 시작되므로 -128까지
		
		// Short : 2Byte
		short sh1 = 128;
//		short sh1 = 32768; // 범위
		short sh3 = -32768;
		//short 값은 (2^15)-1 = 32768-1 = 32767까지 입력 가능, 음수는 -32768 
		
		// int
//		int int1 = 2147483648;
		int int2 = -2147483648;
		
		// 그림문자 입력
//		int tttt = 2147483648;
				
		// long
//		int num1 = 12345678900;
//		long num2 = 12345678900; // 자바는 모든 정수값을 int로만 처리함
		long num3 = 12345678900L; // 정수값 끝에 Long형을 구분하는 L이나 l을 입력해줘야한다
		long num4 = 1L;
		
		// Char
		char ch1 = 'A';
		char ch2 = 'z';
		
		

		
	}

}
