package com.java.chapter10_1_0527;

public class CalculatorTest {

	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 5;
		
		CompleteCalc calc = new CompleteCalc();
		System.out.println(calc.add(n1, n2));
		System.out.println(calc.substract(n1, n2));
		System.out.println(calc.times(n1, n2));
		System.out.println(calc.divide(n1, n2));
		calc.showInfo();

	}

}
