package com.java.chapter11_1_0528;

import javax.swing.plaf.basic.BasicGraphicsUtils;

class Student{
	
	int studentId;
	String studentName;
	
	
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}
	
	public String toString() {
		return studentId + "," + studentName;
	}


@Override
public boolean equals(Object obj) {
	if(obj instanceof Student) {
		Student std = (Student)obj;
		if(this.studentId == std.studentId)
			return true;
		else return false;
	}
	return false;
}

//	@Override
//	public int hashCode() {
//		return studentId;
//	}

}

public class EqualsTest {
	public static void main(String[] args) {
		Student studentLee = new Student(100, "이상원");
		Student studentLee2 = studentLee;
		Student studentSang = new Student(100, "이상원");
		
		if(studentLee == studentLee2)
			System.out.println("studentLee와 studentLee2의 주소는 같습니다.");
		else
			System.out.println("studentLee와 studentLee2의 주소는 다릅니다.");
		
		if(studentLee.equals(studentLee2))
			System.out.println("studentLee와 studentLee2는 동일합니다");
		else
			System.out.println("studentLee와 studentLee2는 동일하지 않습니다.");
		
		if(studentLee == studentSang)
			System.out.println("studentLee와 studentSang의 주소는 같습니다.");
		else
			System.out.println("studentLee와 studentSang의 주소는 다릅니다.");
		
		if(studentLee.equals(studentSang))
			System.out.println("studentLee와 studentSang은 동일합니다.");
		else
			System.out.println("studentLee와 studentSang은 동일하지 않습니다.");
		
		System.out.println("해시코드는 "  + studentLee.hashCode());
		System.out.println("해시코드는 " + studentSang.hashCode());
		// 위아래 같은 해시코드가 출력 된다. 위의 해시코드 오버라이드 적용하면 다른값이 나온다. (주석처리 되어있음, 풀고 해보기.)
		System.out.println("시스템 해시코드는 " + System.identityHashCode(studentLee));
		System.out.println("시스템 해시코드는 " + System.identityHashCode(studentSang));
	}
}
