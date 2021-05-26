package com.java.Day0526;

public class Car {
	protected int cc;
	protected String name;
	
	public Car() {
		this("이름없음", 0);
	}
	
	public Car(String carname, int cc) {
		this.name = carname;
		this.cc = cc;
	}
	
	public String run() {
		return "배기량" + this.cc + " 자동차 " + this.name + " 는 달립니다."; 
	}
}
