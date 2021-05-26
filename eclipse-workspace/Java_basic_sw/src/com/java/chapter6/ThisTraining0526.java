package com.java.chapter6;

class Person2 {
	String name;
	int age;
	String job;
	String gender;
	String blood;
	
	Person2() {
//		this("이름없음", 0);
		this("이름없음", 0, "", "", "직업없음");
	}
	
	Person2(String name, int age) {
//		this.name = name;
//		this.age = age;
		this(name, age, "", "", "직업없음");
	}
	
	Person2(String name, int age, String gender, String blood, String job) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.blood = blood;
		this.job = job;
	}
		
	public void play() {
		String play = "";
		if(this.job.equals("의사")) {
			play = "진료한다";
		} else {
			play = " ... ";
		}
		System.out.println(this.job + " : " + "진료한다");
	}
	
}


public class ThisTraining0526 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
