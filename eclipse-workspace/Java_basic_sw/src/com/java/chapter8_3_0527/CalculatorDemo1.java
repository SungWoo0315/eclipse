package com.java.chapter8_3_0527;

public class CalculatorDemo1 {
	 
	public static void main(String[] args) {
		
		Calculator c = new Calculator();
		c.setOprands(10, 20);
		c.sum();
		c.avg();
		// c.substract();
		
		SubCalculator c1 = new SubCalculator();
		c1.setOprands(10, 20);
		c1.sum();
		c1.avg();
		c1.substract();
		    
	}

}