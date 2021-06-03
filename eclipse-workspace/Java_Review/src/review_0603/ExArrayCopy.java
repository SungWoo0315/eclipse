package review_0603;
public class ExArrayCopy {

	public static void main(String[] args) {
		int[] src = {1,2,3,4};
		int[] dst = new int[10];
		
		ExArrayCopy main = new ExArrayCopy();
		main.arrayCopy(src, 1, dst, 4, 3);
		
		main.arrayPrint(dst);
	}
	
	public void arrayCopy(int[] src, int srcPos, int[] dst, int dstPos, int length) {
		for(int i = 0; i < length; i++) {
			dst[dstPos + i] = src[i + srcPos];
		}
	}
	
	public void arrayPrint(int[] arr) {
		for(int i : arr) {
			System.out.println(i);
		}
	}

}