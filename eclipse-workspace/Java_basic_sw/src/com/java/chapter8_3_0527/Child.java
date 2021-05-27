package com.java.chapter8_3_0527;

public class Child extends Parent {
	
	public int ID;
	
	public Child(String name, int ID) {
		super(name);
		this.name = name;
		this.ID = ID;
	}
	
	public void info() {
		System.out.println(super.name + "가족의"
				+ this.name + "입니다.");
	}
	
	
}
