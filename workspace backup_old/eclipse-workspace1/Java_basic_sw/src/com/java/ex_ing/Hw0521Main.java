package com.java.ex_ing;

import java.util.Scanner;

public class Hw0521Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Student[] students = new Student[2];
		students[0] = new Student();
		students[1] = new Student();
//		students[2] = new Student();
//		students[3] = new Student();
//		students[4] = new Student();
//		students[5] = new Student();
//		students[6] = new Student();
//		students[7] = new Student();
//		students[8] = new Student();
//		students[9] = new Student();
		
		
		int math = 0;
		int sci = 0;
		int en = 0;
		
		for (int i = 0; i < students.length; i++) {
			System.out.println("이름/학년/주소/수학/과학/를 입력하시오.");
			
			students[i].studentName = sc.next();
			students[i].grade = sc.nextInt();
			students[i].address = sc.next();
			students[i].subj[0] = new Score();
			students[i].subj[0].score = sc.nextInt();
		
			students[i].subj[1] = new Score();
			students[i].subj[1].score = sc.nextInt();
			
			students[i].subj[2] = new Score();
			students[i].subj[2].score = sc.nextInt();
			
	
			System.out.println(students.length + "/10");
		
		}	
		
	}

}
