package com.java.chapter6;

class Person {
	String name;
	int age;
	
	Person() {
		// 단! 조건! : this() 생성자 호출은 항상 제일 앞에.
		this("이름없음", 1);
	}
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	Person returnItSelf() {
		return this;
	}
}


public class CallAnotherConst172p {

	public static void main(String[] args) {
		Person noName = new Person();
		System.out.println(noName.name);
		System.out.println(noName.age);
	}

}
