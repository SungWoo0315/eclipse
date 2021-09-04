package hello;

public class Variable2 {

	public static void main(String[] args) {
		
		// Byte형: 1 Byte
		byte bs1 = -128;
		byte bs2 = 127;		// 변수값 128을 대입하면 오류가 난다. 
							// byte의 범위가 (-128 ~ 127)까지이다.
		
		// Short : 2 Byte
		short sh1 = 128;		// 범위안의 변수는 올바르게 적용된다.	
		short sh2 = -32768;		
		short sh3 = 32767;		// short의 범위는 (-32768 ~ 32767)까지이다.
		
		// Int
		int int1 = -2147483648;
		int int2 = 2147483647;		// int의 범위는 (-2147483648 ~ 2147483647)까지이다.
		
		// 그림문자 입력
//		int tttt = 2,147,483,648;
		
		// Long
//		int num1 = 12345678900;		// 표현할수 있는 범위를 넘어서서 오류가 남.
//		long num2 = 12345678900;	// 자바는 모든 정수값을 기본으로 int형으로 처리하기 때문에.
									// 식별자를 쓰지 않아서 오류가 남.
		
		long num3 = 12345678900L;	// long형으로 처리하려면 식별자 "L"을 숫자뒤에 붙여서 사용.
		long num4 = 1L;

		long num5 = 1000;			// 이때 오류가 발생하지 않는 이유는 
									// 1000 숫자가 int형 범위를 넘지 않고 int형이 long 형으로 자동으로 형 변환되었기때문.
									// 범위 내부에 있는 값을 사용할때는 식별자가 필요 없다.
		
		// Char
		char ch1 = 'A';
		char ch2 = 'z';
		
				
	}
}
