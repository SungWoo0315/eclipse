package com.java.chapter7_1_0531;

class Book {
	String name;
	public Book(String n) {
		this.name = n;
	}
}

public class ArrayCopy {

	public static void main(String[] args) {
		int[] array1 = {10, 20, 30, 40, 50};
		int[] array2 = {1, 2, 3, 4, 5};
		
		try {
			System.arraycopy(array1, 1, array2, 1, 5);
		} catch (Exception e) {
			System.out.println(e);
		}
		
		System.arraycopy(array1, 0, array2, 1, 4);
		
		// 전체 복사
		System.arraycopy(array1, 0, array2, 0, array1.length);
		
		for (int i = 0; i < array2.length; i++) {
			System.out.println(array2[i]);
		}
		
		Book[] book1 = new Book[3];
		Book[] book2 = new Book[3];
		
		book1[0] = new Book("태백산맥");
		book1[1] = new Book("태백산맥");
		book1[2] = new Book("태백산맥");
		
		System.arraycopy(book1, 0, book2, 0, book2.length);
	}

}
