package com.java.chapter5_0526;

public class StudentMain {

	public static void main(String[] args) {
		Student studentLee = new Student();
		
//		studentLee.studentName = "이상원";  
		//클래스에서 private 지정으로 오류발생
		
		studentLee.setStudentName("이상원");
		//setStudentName() 메서드를 통해 private변수에 접근 가능.
		
		System.out.println(studentLee.getStudentName());

	}

}
