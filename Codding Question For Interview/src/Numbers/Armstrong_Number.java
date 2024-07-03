package Numbers;

import java.util.Scanner;

public class Armstrong_Number {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Number : ");
		int num = sc.nextInt();

		
		int rem,sum=0;
		int temp = num;
		
		while(num>0) {
			
			rem = num % 10;
			
			num = num / 10;
			
			sum = sum  +rem*rem*rem;
			
		}
		if(sum == temp) {
			 System.out.println("Number in Armstrong");
		 }else {
			 System.out.println("Number in not Armstrong");

		 }
	}

}
