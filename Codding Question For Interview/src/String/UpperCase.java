package String;

import java.util.Scanner;

public class UpperCase {
	
	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Name : ");
		
		String name = sc.next();
        
		System.out.println(name.toUpperCase());
	}

}
