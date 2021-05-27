package com.java.chapter5_4;

public class ShopOd {
	long odnum;
	String id;
	String day;
	String name;
	String pnum;
	String address;
	
	public void print() {
		System.out.println("1. 주문번호: " + odnum);
		System.out.println("2. 주문아이디: " + id);
		System.out.println("3. 주문날짜: " + day);
		System.out.println("4. 주문자 이름: " + name);
		System.out.println("4. 주문상품번호: " + pnum);
		System.out.println("4. 배송주소: " + address);
	}
}
