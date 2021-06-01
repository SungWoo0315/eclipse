package com.java.chapter13_1_0601;

import java.util.Date;
import java.text.DateFormat;

public class InnerClassExample3 {

	public void printStatus() {
		
		class DateFormat {
			private Date date;
			
			public DateFormat(Date date) {
				this.date = date;
			}
			
			public String getDateFormat() {
				return date.toString();
			}
			
		}
		
		DateFormat format = new DateFormat(new Date());
		System.out.println("The Date : " + format);
		
		
	}
	
	
	public static void main(String[] args) {
		InnerClassExample3 example = new InnerClassExample3();
		example.printStatus();

	}

}
