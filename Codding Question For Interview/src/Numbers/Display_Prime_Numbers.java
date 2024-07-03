package Numbers;

import java.util.Scanner;

public class Display_Prime_Numbers {

	public static void main(String[] args) {
		
		System.out.println("Enter Two Number ");
		Scanner sc = new Scanner(System.in);
		
		
         System.out.print("Enter First no : ");
		int n1 = sc.nextInt();

		System.out.print("Enter Second no : ");
		int n2 = sc.nextInt();
		
		int i,j;
		
		for(i=n1; i<=n2; i++) {
			
			for(j=2; j<=i; j++) {
				
				if(i % j == 0) {
					break;				
					}
				
			}
			
			if(i==j) {
				System.out.println(j);
			}
		}
	}
}
