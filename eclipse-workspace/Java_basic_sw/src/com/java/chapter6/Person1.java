package com.java.chapter6;

public class Person1 {
	String name;
	int age;
	String job;
	String gender;
	String blood;
	
	Person1() {
//		this("이름없음", 0);
		this("이름없음", 0, "", "", "직업없음");
	}
	
	Person1(String name, int age) {
//		this.name = name;
//		this.age = age;
		this(name, age, "", "", "직업없음");
	}
	
	Person1(String name, int age, String gender, String blood, String job) {
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

