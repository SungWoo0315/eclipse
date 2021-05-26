package com.java.chapter8_1;

public class CustomerTest1 {

	public static void main(String[] args) {
		
//		Customer customerLee = new Customer();
//		customerLee.setCustomerID(10010);
//		customerLee.setCustomerName("이순신");
//		customerLee.bonusPoint = 1000;
//		System.out.println(customerLee.showCutomerInfo());
		
		//생성자 호출 순서.
		
		VIPCustomer customerKim = new VIPCustomer();
		customerKim.setCustomerID(10020);
		customerKim.setCustomerName("김유신");
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCutomerInfo());
		
		//객체 캐스팅
		Customer vc = new VIPCustomer();
	}

}
