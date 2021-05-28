package com.java.chapter11_3_0528;

import java.util.Calendar;

public class CalenderTest {

	public static void main(String[] args) {
		// Calender
		
		Calendar now = Calendar.getInstance(); // singletone
		
		now.get(Calendar.DAY_OF_WEEK);
		now.get(Calendar.YEAR);
		now.get(Calendar.DAY_OF_MONTH);
		now.get(Calendar.DAY_OF_YEAR);
		
		
	}

}
