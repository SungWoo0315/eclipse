package com.java.chapter6;

class BirthDay {

			int day;
			int month;
			int year;
			
			public void setYear(int year) {
				this.year = year;
			}
			
			public void PrintThis() {
				System.out.println(this);
			}
			
			public void test(int month) {
				this.month = month; // 지역변수. 멤버변수 구분.
			}
			
			public void test1(int j) {
				int month = 100;
				this.month = j;
				
//				month = month;
				this.month = month;
			}
		
}

 public class ThisExample170pBirthDay {
	 public static void main(String[] args) {
		 BirthDay bDay = new BirthDay();
		 bDay.setYear(2000);
		 System.out.println(bDay);
		 bDay.PrintThis();
	 }
 }

