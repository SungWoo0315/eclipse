package com.java.chapter11_4_0528;

import java.lang.reflect.Method;

import com.java.chapter11_1_0528.ObjectCloneTest;
import com.java.chapter11_1_0528.EqualsTest;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException {

		//1
		String s = new String();
		Class c = s.getClass();
		Method[] m = c.getMethods();
		for (Method method : m) {
			System.out.println(method.getName());
		}
		
		//2
		c = String.class;
		c = EqualsTest.class;
		
		//3
		try {
		
		c = Class.forName("com.java.chapter11_1_0528.ObjectCloneTest");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println(c.getName());
		
		try {
			ObjectCloneTest ct = (ObjectCloneTest)c.newInstance();
			} catch (InstantiationException | IllegalAccessException e) {
				e.printStackTrace();
			}
			
		
	}

}
