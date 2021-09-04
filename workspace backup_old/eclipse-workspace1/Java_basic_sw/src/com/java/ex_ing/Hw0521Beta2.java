package com.java.ex_ing;

import java.util.Scanner;

public class Hw0521Beta2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s;
		String[] str;
		Student[] student = new Student[2];
		
		int math_total = 0;
		int sci_total = 0;
		int en_total = 0;
		
		int math_avg = 0;
		int sci_avg = 0;
		int en_avg = 0;
		
		for (int i = 0; i < 10; i++) {
			System.out.println("이름/학년/주소/수학성적/과학성적/영어성적 을 입력하세요.");
			s = sc.nextLine();
			str = s.split("/");
			
			if("/sum".equals(s)) {
				for (int j = 0; j < i; j++) {
					math_total += student[j].subj[0].score;
					sci_total += student[j].subj[1].score;
					en_total += student[j].subj[2].score;
					math_avg = math_total/i;
					sci_avg = math_total/i;
					en_avg = math_total/i;
					
					
				}
				break;
			}
			
			System.out.println(i+1 +  "/10");
			
			student[i] = new Student();
			student[i].name = str[0];
			student[i].grade = Integer.parseInt(str[1]);
			student[i].address = str[2];
			student[i].subj = new Score[3];
			
			student[i].subj[0] = new Score();
			student[i].subj[0].subject = "수학";
			student[i].subj[0].score = Integer.parseInt(str[3]);
			
			student[i].subj[1] = new Score();
			student[i].subj[1].subject = "과학";
			student[i].subj[1].score = Integer.parseInt(str[4]);
			
			student[i].subj[2] = new Score();
			student[i].subj[2].subject = "영어";
			student[i].subj[2].score = Integer.parseInt(str[5]);
			
			
		}
		
			System.out.println("수학 : " + math_total + ", 평균 : " + math_avg);
			System.out.println("과학 : " + sci_total + ", 평균 : " + sci_avg);
			System.out.println("영어 : " + en_total + ", 평균 : " + en_avg);
	}

}
