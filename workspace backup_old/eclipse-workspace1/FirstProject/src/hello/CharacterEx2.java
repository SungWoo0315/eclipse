package hello;

public class CharacterEx2 {

	public static void main(String[] args) {
		char ch1 = '한';
		char ch2 = '\uD55C'; // (\)백슬래시 = 유니코드의 Escape(회피시퀀스) sequence 이다.
		
		System.out.println(ch1);
		System.out.println(ch2);
		
//		char ch3 = -66;
//		System.out.println(ch3);       // 비정상
		
		int ich = -66;
		System.out.println((char)ich);   // 정상
		
		
	}

}
