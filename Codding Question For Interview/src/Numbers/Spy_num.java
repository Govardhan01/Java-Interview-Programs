package Numbers;

import java.util.Scanner;

public class Spy_num {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num ;
		System.out.print("Enter number: ");
		num = sc.nextInt();
		int rem,sum=0,pro=1;
		
		for(int i=num; i>0; i=i/10) {
			
			rem = i %10;
			sum = sum + rem;
			pro = pro * rem;
		}
		
		if(sum == pro) {
			System.out.println("number is spy");
		}else {
			System.out.println("number is not spy");
		}
	}
}
