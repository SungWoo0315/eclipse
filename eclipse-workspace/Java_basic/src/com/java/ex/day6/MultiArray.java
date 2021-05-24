package com.java.ex.day6;

public class MultiArray {

	public static void main(String[] args) {
		
		// 219p
		// 2 x 3 배열 : 행우선
		
		int[][] arr = new int[2][3];
		
		System.out.println("행 : " + arr.length);
		System.out.println("열 : " + arr[0].length);
		
		System.out.println("열 : " + arr[1].length);
		
		for(int i = 0; i < arr.length; i++) {//행
			
			for(int j = 0; j < arr[0].length; j++) {//열
				arr[i][j] = 1; //행x열
			}
		}
		for(int i = 0; i < arr.length; i++) {//행
			
			for(int j = 0; j < arr[0].length; j++) {//열
				System.out.println(arr[i][j]);
			}
		}
		
	}

}
