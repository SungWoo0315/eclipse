package review_0603;

public class ArrayCopy {

	static int[] arrayCopy(int[] arr, int index, int[] darr, int dstPos, int length) {
		
		for (int i = 0; i < index + length; i++) {
			darr[dstPos] = arr[i];
			dstPos++;
		}
		
		return darr;
	}
	
	
	public static void main(String[] args) {
		
		int[] arr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		int[] darr = new int[20];
		
		arrayCopy(arr, 0, darr, 5, 10);
		
		for (int a : darr) {
			System.out.println(a);
		}
		
	}

}
