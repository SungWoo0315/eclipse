package com.java.ex_ing;

import java.util.Scanner;

public class Hw0521Beta {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] str = new String[5];
		Student student[] = new Student[5];
		
		int math = 0;
		int sci = 0;
		int en = 0;
		
		for (int i = 0; i < str.length; i++) {
			
			System.out.println("이름/학년/주소/수학성적/과학성적/영어성적 을 입력하세요.");
			System.out.println((i+1) + "/" + str.length);
			str[i] = sc.next();
			
			String person = str[i];
			String[] data = person.split("/");
			
			student[i] = new Student();
			student[i].name = data[0];
			student[i].grade = Integer.parseInt(data[1]);
			student[i].address = data[2];
			
			student[i].subj = new Score[3];
			
			for (int j = 0; j < 3; j++) {
			
			student[i].subj[j] = new Score();
				
			student[i].subj[0].score = Integer.parseInt(data[3]);
			student[i].subj[0].score = Integer.parseInt(data[4]);
			student[i].subj[0].score = Integer.parseInt(data[5]);
				
			math += student[i].subj[0].score;
			sci += student[i].subj[1].score;
			en += student[i].subj[2].score;
			
			}
			
			System.out.println("수학 : " + math + " 평균 : " + (math/str.length));
			System.out.println("과학 : " + sci + " 평균 : " + (sci/str.length));
			System.out.println("영어 : " + en + " 평균 : " + (en/str.length));
			
			
		}
		
		
		
		

	}

}
