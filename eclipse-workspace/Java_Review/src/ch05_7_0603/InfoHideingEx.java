package ch05_7_0603;

public class InfoHideingEx {

	public static void main(String[] args) {
		// 접근제한자 : public > protected > package > private

		Student2 st1 = new Student2();
		st1.name = "홍길동";
		st1.address = "";
		
		
		review_0603.Student2 st2 = new review_0603.Student2();
		// package 의 가시성
		// public private 등 으로 인해 타 패키지 호출이 안됨.
//		st2.name = "홍길동";
//		st2.address = "";
		
		
		review_0603.Student3 st3 = new review_0603.Student3("이름", 0);
	}

}
