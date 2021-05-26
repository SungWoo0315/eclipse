package com.java.chapter8_1;

public class CustomerMain {

	public static void main(String[] args) {

		Customer c1 = new Customer();
//		c1.customerName = "홍길동"; 
		//private 라서 에러나옴. get set 써야함.
		c1.setCustomerName("홍길동");
		c1.setCustomerID(1);
		c1.setBonusPoint(100);
		
		System.out.println(c1.showCutomerInfo());
		
		Customer c2 = new Customer(10, "강감찬");
		
		System.out.println(c2.showCutomerInfo());

	}

}
