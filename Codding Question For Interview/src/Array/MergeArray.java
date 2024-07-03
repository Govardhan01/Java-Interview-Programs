package Array;

import java.util.Arrays;

public class MergeArray {
	
	public static void main(String[] args) {
		
		int a1[] = {9,8,7,6};
		
		int a2[] = {1,2,3,4};
		
		int a1length = a1.length;
		
		int a2length = a2.length;
		
		int result[] = new int[a1length+a2length];
		
		System.arraycopy(a1, 0, result, 0, a2length);
		
		System.arraycopy(a2, 0, result, a1length, a2length);
		
		System.out.println(Arrays.toString(result));

		
	}

}
