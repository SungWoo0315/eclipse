package com.java.chapter5_5;

public class SqExam {
	String name;
	float weight;
	float height;
	
	public SqExam() {
		height = 0;
		weight = 0;
	}
	
	public SqExam(String n) {
		name = n;
		
		System.out.println(name);
	}
	
	public SqExam(float w, float h) {
		height = h;
		weight = w;
		
		System.out.println("w:" + weight + "   h:" + height);
	}
	
	public SqExam(String n, float w, float h) {
		name = n;
		weight = w;
		height = h;
		System.out.println(name + ": "+
				 "w:" + weight + "   h:" + height);
	}
	
}
