package com.java.ex_ing;

import java.util.Scanner;

public class MorseTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자 및 문장을 적으세요.");
		
		String[] str = sc.nextLine().split("");
		
		
		
		String[] morse = { ".-", "-...", "-.-." ,"-..", ".",

			     "..-.", "--.", "....", "..", ".---",

			     "-.-", ".-..", "--", "-.", "---",

			     ".--.", "--.-", ".-.", "...", "-",

			     "..-", "...-", ".--", "-..-", "-.--",

			     "--.." };
			     
		String[] ap = {"A","B","C","D","E",
						"F","G","H","I","J",
						"K","L","M","N","O",
						"P","Q","R","S","T",
						"U","V","W","X","Y",
						"Z"};
		
		String result = "";
		
		
		for(int i=0; i < str.length; i++) {
			
			for(int j=0; j<ap.length; j++) {
			
				if(str[i].equalsIgnoreCase(ap[j])) {
					result += morse[j]+ " ";
					continue;
				}
			}
		}
		System.out.println("모스부호결과 : ");
		System.out.println(result);
	}

}
