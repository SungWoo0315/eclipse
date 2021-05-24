package com.java.ex_ing;

import java.util.Scanner;

public class ArrayTest4Pdf {

	public static void main(String[] args) {
		/**String[] score = new String[10];
		score[0] = "홍길동, 100, 100";
		score[1] = "이도령, 90, 90";
		score[2] = "삼길동, 80, 80";
		score[3] = "사길동, 70, 70";
		score[4] = "오길동, 60, 60";
		score[5] = "육길동, 50, 50";
		score[6] = "칠길동, 40, 40";
		score[7] = "팔길동, 30, 30";
		score[8] = "구길동, 20, 20";
		score[9] = "십길동, 10, 10";

		int math = 0;
		int sci = 0;

		for (int i = 0; i < score.length; i++) {
			String person = score[i];
			String[] data = person.split(",");
			System.out.println("이름: " + data[0] + " 과학: " + data[1] + " 수학: " + data[2]);

			System.out.println("과학평균: " + data[1]);
		**/
		
		Scanner sc = new Scanner(System.in);
		String student[] = new String[2];
		int math = 0;
		int sci = 0;
		
		for (int i =0; i < student.length; i++) {
			System.out.println("이름/과학/수학 점수를 입력.");
			student[i] = sc.next();
			String person = student[i];
			String[] data =person.split(",");
			
			math += Integer.parseInt(data[1]);
			sci += Integer.parseInt(data[2]);
		}
			System.out.println("------");
			System.out.println("과학 : " + sci + "," + sci / student.length);
			System.out.println("수학 : " + math+ "," + math / student.length);
		}

}