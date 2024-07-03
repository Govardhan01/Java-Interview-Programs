package Numbers;

import java.util.Scanner;

public class Count_NoOf_Digits_inNumber {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Number : ");
		
		int no = sc.nextInt();
		
		int rem , count = 0;
		
		while(no > 0) {
			rem = no % 10;
			no = no/10;
			count++;
			
		}
		
		System.out.println("No Of Digite is : " +count);
		
	}
}
