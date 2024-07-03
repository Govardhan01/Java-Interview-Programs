package String;

import java.util.Scanner;

public class Cout_char_inString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Name : ");
		
		String name = sc.next();
	
		System.out.println(name.length());
	}
}
