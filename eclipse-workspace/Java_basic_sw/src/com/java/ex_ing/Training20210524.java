package com.java.ex_ing;

import java.util.Iterator;
import java.util.Scanner;

public class Training20210524 {

	public static void main(String[] args) {
		
		//강사님 방법.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문장, 문자를 입력하세요.");
		
		String[] str = sc.nextLine().split("");
		
		String result = "";
		
		for (int i = 0; i < str.length; i++) {
					//.equalsIgnoreCase 대소문자 구분 x
			
			String text = str[i];
			
			if ("A".equalsIgnoreCase(str[i])) {
				result += ".- ";
			} else if ("B".equalsIgnoreCase(str[i])) {
				result += "-... ";
			} else if ("C".equalsIgnoreCase(str[i])) {
				result += "-.-. ";
			} else if ("D".equalsIgnoreCase(str[i])) {
				result += "-.. ";
			} else if ("E".equalsIgnoreCase(str[i])) {
				result += ". ";
			} else if ("F".equalsIgnoreCase(str[i])) {
				result += "..-. ";
			} else if ("G".equalsIgnoreCase(str[i])) {
				result += "--. ";
			} else if ("H".equalsIgnoreCase(str[i])) {
				result += ".... ";
			} else if ("I".equalsIgnoreCase(str[i])) {
				result += ".. ";
			} else if ("J".equalsIgnoreCase(str[i])) {
				result += ".--- ";
			} else if ("K".equalsIgnoreCase(str[i])) {
				result += "-.- ";
			} else if ("L".equalsIgnoreCase(str[i])) {
				result += ".-.. ";
			} else if ("M".equalsIgnoreCase(str[i])) {
				result += "-- ";
			} else if ("N".equalsIgnoreCase(str[i])) {
				result += "-. ";
			} else if ("O".equalsIgnoreCase(str[i])) {
				result += "--- ";
			} else if ("P".equalsIgnoreCase(str[i])) {
				result += "--. ";
			} else if ("Q".equalsIgnoreCase(str[i])) {
				result += "--.- ";
			} else if ("R".equalsIgnoreCase(str[i])) {
				result += ".-. ";
			} else if ("S".equalsIgnoreCase(str[i])) {
				result += "... ";
			} else if ("T".equalsIgnoreCase(str[i])) {
				result += "- ";
			} else if ("U".equalsIgnoreCase(str[i])) {
				result += "..- ";
			} else if ("V".equalsIgnoreCase(str[i])) {
				result += "...- ";
			} else if ("W".equalsIgnoreCase(str[i])) {
				result += ".-- ";
			} else if ("X".equalsIgnoreCase(str[i])) {
				result += "-..- ";
			} else if ("Y".equalsIgnoreCase(str[i])) {
				result += "-.-- ";
			} else if ("Z".equalsIgnoreCase(str[i])) {
				result += "--.. ";
			}
				
			System.out.println("text : " + text);
			
		}
		
		
		System.out.println("morse : " + result);
		
		
		
		
		
		
		
		
		
		//배열 연습 , 내가 해본것.
		
	/**	Scanner sc = new Scanner(System.in);
		
		System.out.println("문장, 문자를 입력하세요.");
		String text = sc.nextLine();
	
		String[] morse = { ".-", "-...", "-.-." ,"-..", ".",

			     "..-.", "--.", "....", "..", ".---",

			     "-.-", ".-..", "--", "-.", "---",

			     ".--.", "--.-", ".-.", "...", "-",

			     "..-", "...-", ".--", "-..-", "-.--",

			     "--.." };
		
		String result = "";
		
		for (int i = 0; i < text.length(); i++) {
			
			result += morse[text.charAt(i)-'A' & text.charAt(i)-'a'];

		}
		
		System.out.println("text : " + text);
		System.out.println("morse : " + result);
	 **/

		
	/**	// 이동희님이 한것.
		Scanner sc = new Scanner(System.in);
		String[] str = sc.nextLine().split("");
		
		String[] morse = { ".-", "-...", "-.-." ,"-..", ".",

			     "..-.", "--.", "....", "..", ".---",

			     "-.-", ".-..", "--", "-.", "---",

			     ".--.", "--.-", ".-.", "...", "-",

			     "..-", "...-", ".--", "-..-", "-.--",

			     "--.." };
			     
		String[] ap = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P",
						"Q","R","S","T","U","V","W","X","Y","Z"
		
		}
		
		String result = "";
		
		for(int i=0; i < str.length; i++) {
			
			for(int j=0; j<ap.length; j++) {
			
				if(str[i].equalsIgnoreCase(ap[j])) {
					result += morse[j]+ " ";
					continue;
				}
			}
		}
		System.out.println(result);
		
		**/
	}

}
