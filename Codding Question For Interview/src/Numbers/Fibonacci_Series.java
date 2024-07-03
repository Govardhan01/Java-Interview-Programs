package Numbers;

import java.util.Scanner;

public class Fibonacci_Series {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number : ");
		
		int term = sc.nextInt();
		
		int a=0,b=1,c;
		
		for(int i=1; i<=term; i++) {
			
			System.out.print(a+" ");
			
			c = a + b;
			a = b;
			b = c;
		}
		
		
	}

}
