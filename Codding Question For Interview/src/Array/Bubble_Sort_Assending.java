package Array;

public class Bubble_Sort_Assending {
	
	public static void printarr(int arr[]) {
		for(int i=0; i<arr.length; i++) {
		System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		int arr[] = {15,8,1,7,3,2,9};
		
		for(int i=0; i<arr.length; i++) {
			
			for(int j=0; j<arr.length-i-1; j++) {
				
				
				if(arr[j] > arr[j+1]) {
				
					//swap
					int temp = arr[j];
					
					arr[j] = arr[j+1];
					
					arr[j+1] = temp;
				}
			}
			
		}
		
		printarr(arr);
		
		
	}

}
