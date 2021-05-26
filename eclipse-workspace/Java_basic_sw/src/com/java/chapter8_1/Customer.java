package com.java.chapter8_1;

public class Customer {
	
	private int customerID;
	private String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	
	protected int getCustomerID() {
		return customerID;
	}

	protected void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	protected String getCustomerName() {
		return customerName;
	}

	protected void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	protected String getCustomerGrade() {
		return customerGrade;
	}

	protected void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

	protected int getBonusPoint() {
		return bonusPoint;
	}

	protected void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

	protected double getBonusRatio() {
		return bonusRatio;
	}

	protected void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}

	public Customer() {
		this(0, "");
//		customerGrade = "SILVER";
//		bonusRatio = 0.01;
//		System.out.println("Customer() 생성자 호출");
	}
	
	public Customer(int customerID, String customerName) {
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		
		this.customerID = customerID;
		this.customerName = customerName;
		
		System.out.println("Customer() 생성자 호출");
//		System.out.println("Customer(int, String) 생성자 호출");
		
	}
	
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	public String showCutomerInfo() {
		return customerName + " 님의 등급은 " + customerGrade + "이며, 보너스포인트는 " + 
	bonusPoint + " p" + " 입니다.";
	}	

}
