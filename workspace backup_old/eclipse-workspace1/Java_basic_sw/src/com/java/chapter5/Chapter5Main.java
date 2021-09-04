package com.java.chapter5;

import com.java.chapter5_2.Person;

//import com.java.ex_ing.Student;

public class Chapter5Main {

	public static void main(String[] args) {
		
		// 다른 패키지.
		com.java.ex_ing.Student st3 = new com.java.ex_ing.Student();
		
		Student3 st = new Student3(); // com.java.chapter5
		// com.java.chapter.Student st2;
		
		Person p = new Person();
		
		
		// . operator
		st.studentId = 1000;
		st.studentName = "홍길동";
		
		
		//사용
		System.out.println(st.studentName);
		//학생정보
		//st.studentName + st.studentId + st.adress;
		
		// 2. 반환형식 있다.
		String info  = st.showStudentInfo();
		System.out.println(info);
		
		System.out.println(st.showStudentInfo()); //위의 두줄과 같은형식이다.
		
		// 3. 반환형식 없다.
		st.println();
		
		// 4. 매개변수
		info = st.setScore(1000);
		System.out.println(info);

		st.setScore2(1000);
		System.out.println(info);


	}

}
