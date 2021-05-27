package com.java.chapter5_2;

public class MethodTestMain {

	public static void main(String[] args) {
		
		MethodClass m = new MethodClass();
		
		MethodClass m1;
		m1 = new MethodClass();
		
		int r = m.add(10, 100);
		
		m.add(10, 100);
		
		m.printTenTotal();
		
		m.getTenTotal();
		
		m.printGreeting("hahahah");
		
		m.divide(100, 1);
		
		m.divide(100, 0);
		

	}

}
