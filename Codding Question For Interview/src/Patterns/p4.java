package Patterns;

public class p4 {
	
	public static void main(String[] args) {
		/*
		 
		out put : - 
		   *
		  **
		 ***
		****
		
		*/
		
		int n=5;
		
		
		for( int i =1; i<=n; i++) {
			
			for(int j=1; j<=n-i; j++) {
				// free spaces
				System.out.print(" ");
			}
			
			for(int j = 1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
