package kr.java.chapter2;

public class ChracterEx2 {

	public static void main(String[] args) {
		char ch1 = '한';
		char ch2 = '\uD55C'; // 유니코드의 Escape sequence 형식
							 // 역슬래시(\)뒤에 u를 넣으면 유니코드 시퀀스 발동! 
		
		char ch3 = '\uAE00'; // "글"
		System.out.println("\uAE00:" + ch3);
		System.out.println("\\uAE00:" + ch3); // 역슬래시(\) 두개면 escape로 역으로 출력됨
		
		System.out.println(ch1);
		System.out.println(ch2);
		
//		char ch3 = -66;  	// char형은 부호가 있어도 부호비트 그대로를 문자화 시키기 때문에 오류가 남
//		System.out.println(ch3); 
		
		int ich = -66;
		System.out.println((char)ich);

	}

}
