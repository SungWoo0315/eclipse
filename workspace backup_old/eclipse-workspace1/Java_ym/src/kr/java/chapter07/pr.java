package kr.java.chapter07;

import java.util.Scanner;

public class pr {

	public static void main(String[] args) {
		// http://blog.naver.com/PostView.nhn?blogId=amabile29&logNo=220608058580&parentCategoryNo=&categoryNo=31&viewDate=&isShowPopularPosts=true&from=search
		
		Scanner sc = new Scanner(System.in);
		String[] arrInit = sc.nextLine().split(" ");
		String[][] arrStr = new String[arrInit.length][arrInit.length];
		arrStr[0] = arrInit;
		for(int i=0; i<arrStr.length-1; i++)
			arrStr[i+1] = sc.nextLine().split(" ");
		for(int i=0; i < arrStr.length; i++) {
			for(int j=0; j<arrStr.length; j++)
				System.out.print(arrStr[j][i] + " ");
					}
		
	}
}
