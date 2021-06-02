package ch05__0602;

public class ClassTest1 {

	test test;			// 소문자만 쓰면 혼동이 올 수 있다.
	ArrayTest atest;	// 대문자로 구분.
	
	class test { // 클래스 이름 시작은 대문자로 해야 보기 편하다. 위와같이 헷갈림.
		
	}
	
	class ArrayTest {
		
	}
	
	public void test() {
		System.out.println("test()");
	}
	
		
	public static void main(String[] args) {
		ClassTest1 ex = new ClassTest1();
		ex.test();
		String[] r = ex.stringArray("1", null, null);
	}

	
	// 메소드
	// Modifier 리턴타입 [static] method_name([매개변수]) {코드블럭}
	// 리턴타입 : 자료형 -> 코드블럭에 `return 자료형`이 있어야한다.
	// 매개변수 : 자료형 이름으로 전달.
	// 가상메서드 의미 : p254  
	// 메서드 매개변수 전달방식:
	// 1. Copy by value
	// 2. Copy by reference.
	
	public String[] stringArray(String s1, String s2, String s3) {
		// 지역변수.
		String[] result;
		result = new String[3];
		
		result[0] = s1;
		result[1] = s2;
		result[2] = s3;
		
		return result;
	}
	
	public void copybyvalue(int i) { }; // Copy by value.
	
	
	
	
	
	
	
	
	
}
