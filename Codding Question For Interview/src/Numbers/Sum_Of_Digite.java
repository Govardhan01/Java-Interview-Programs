package Numbers;

import java.util.Scanner;

public class Sum_Of_Digite {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Number : ");
		
		int numb = sc.nextInt();
		
		int rem , sum = 0;
		
		while(numb > 0) {
			rem = numb % 10;
			
			numb = numb / 10;
			
			sum = sum + rem;
			
		}
		
		System.out.println("Sum of Digite : " + sum);
	}
}
