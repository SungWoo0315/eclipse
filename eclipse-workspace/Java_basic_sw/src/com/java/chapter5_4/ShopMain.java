package com.java.chapter5_4;

public class ShopMain {

	public static void main(String[] args) {

		ShopOd sh = new ShopOd();
		
		sh.odnum = 201803120001L;
		sh.id = "abc123";
		sh.day = "2018년 3월 12일";
		sh.name = "홍길순";
		sh.pnum = "PD0345-12";
		sh.address = "서울시 영등포구 여의도동20번지";
				
		sh.print();
		

	}

}
