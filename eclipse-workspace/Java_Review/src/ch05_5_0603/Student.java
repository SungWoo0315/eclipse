package ch05_5_0603;

public class Student {
	// 변수 (필드)
	int age;
	String name;
	// 메서드
	
	// 생성자 : 특수한 메서드
	// - return 이 없다! 
	// 클래스 이름() {}
	
	// 기본생성자 default constructor
	public Student() {
		
	}
	
	// 만약 기본생성자 구현안하고 -> 다른생성자를 구현하면
	// new 기본생성자 호출은 안됨.
	
	public Student(String n, int a) {
		age = a;
		name = n;
	}
	
	public Student(String n, int a, String t) {
		age = a;
		name = n;
	}
}
