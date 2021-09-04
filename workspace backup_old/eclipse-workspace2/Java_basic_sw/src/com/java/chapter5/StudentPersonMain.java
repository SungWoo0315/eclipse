package com.java.chapter5;

import java.util.Arrays;

public class StudentPersonMain {

	public static void main(String[] args) {

		String student2;
		student2 = new String("홍길동/구로구/2");
		
		String[] data = student2.split("/");
		System.out.println(data[0]); // 이름
		//student2 = "이순신/광양/2"; 값을 바꾸고 싶으면 이렇게 수정해야 
		
		data[0] = "이순신"; //정보 불일치 여지가 생김.
							// 객체로 사용하면 해결.
							// 동적인경우 매우 불편.
		
		
		//클래스는 객체화 해서 사용 : instantiation
		//Student.java 와 연결.
		Student student;
		student = new Student();
		student.address = "구로구";
		student.studentName = "홍길동";
		student.grade = 2;
		
		System.out.println(student.studentName);
		System.out.println(student.address);
		System.out.println(student.grade);
		
		student.studentName = "이순신"; //가능한 쓰지않는 방법.
		//메소드 업데이트로 사용.
		//정보노출 때문. [정보은닉 교재 05-7]
		
		System.out.println(student.studentName);
		
		Person person;
		person = new Person();

	}

}