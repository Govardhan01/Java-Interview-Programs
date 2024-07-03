package Numbers;

import java.util.Scanner;

public class Neon_num {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("Enter Number : ");
		num = sc.nextInt();
		int sq,rem,sum=0;
		sq=num*num;
		
		for(int i = sq; i>0; i=i/10) {
			
			rem = i % 10;
			sum = sum + rem;
		}
		
		if(sum == num) {
			System.out.println("Number is neon");
		}else {
			System.out.println("Number is not neon");
		}
	}
}
