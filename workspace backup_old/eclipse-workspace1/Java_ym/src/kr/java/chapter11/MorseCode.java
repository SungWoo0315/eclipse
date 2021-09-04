package kr.java.chapter11;

import java.util.Scanner;

public class MorseCode {

	public static void main(String[] args) {
		
		System.out.println("영어를 입력하세요.");
		
		Scanner sc = new Scanner(System.in);
		
		String str;
		int i, j;
		str = sc.nextLine();
		
        String[] morse = {
        		".-", "-...", "-.-." ,"-..", ".", "..-.", "--.",
        		"....", "..", ".---", "-.-", ".-..", "--", "-.",
        		"---", "--.", "--.-", ".-.", "...", "-", "..-",
        		"...-", ".--", "-..-", "-.--", "--.."
        };
        
		
		for(i=0; i<str.length(); i++) {
			
			if(str.charAt(i)>=65 && str.charAt(i)<=90) {
				j=65-str.charAt(i);
				System.out.print(morse[j]);
			}
			else if(str.charAt(i)>=97 && str.charAt(i)<=122) {
				j=122-str.charAt(i);
				System.out.print(morse[j]);
			}
			else {
				System.out.print(" ");
			}
		}
		
        

        
        


	}

}
