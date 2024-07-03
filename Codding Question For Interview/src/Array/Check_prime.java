package Array;

public class Check_prime {

	public static void main(String[] args) {
		
		int arr[] = {2,3,4,5,6,7,8,9,10,11};
		int i, j;

		for(i=arr[0]; i<arr[arr.length]; i++) {
			
			for(j=2; j<=i; j++) {
				
				if(i % j == 0) {
					break;				}
				
			}
			
			if(i==j) {
				System.out.println(j);
			}
		}
	}
}
