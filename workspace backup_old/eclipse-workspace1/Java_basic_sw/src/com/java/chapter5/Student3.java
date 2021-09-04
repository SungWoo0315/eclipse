package com.java.chapter5;

public class Student3 {	
// class 지시자 : 클래스의 코드를 정의하는 곳!
	
	
		// 멤버필드 (변수, 식별자) : 속성
		// 속성은 어디에 위치해도 상관없다.
		int studentId;
		String studentName;
		int grade;	
		String adress;
		int score; 
		

		// 멤버 메서드 : 함수
		
		// 1. 클래스 안에서만 존재.
		
		// 2. 반환 형식이 있다.
		
		public String showStudentInfo() {
			// 이름/아이디/주소
			String info = studentName + "/"  +studentId + "/" + adress;
			return info;
		}
		
		// 3. 반환이 없을 수 있다. : void
		// 클래스 내부에서 연산/계산/처리 
		// -> 클래스 내부에 저장... 출력
		public void println() {
			String info = studentName + "/"  +studentId + "/" + adress;
			System.out.println(info);
		}
		
		
		// 4. 매개변수를 사용.
		// -> 점수 전달하고, 처리, info 반환.
		public String setScore(int s) {
			score = s;
			String info = showStudentInfo();
			return info + " / score=" + score;
		}
		
		public void setScore2(int s) {
			score = s;
		}
		
}




