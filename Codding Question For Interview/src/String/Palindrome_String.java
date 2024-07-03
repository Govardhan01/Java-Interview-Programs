package String;

import java.util.Scanner;

public class Palindrome_String {

	public static void main(String[] args) {
		//A string is called a palindrome string if the reverse of that string is the same as the original string.
	Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Name : ");
		
		String name = sc.next();

		char ch ;
		
		String str="";
		
		for(int i=0; i<name.length(); i++ ) {
			ch = name.charAt(i);	
			str = ch + str;
		}
		
		if(name.equals(str)) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	}
}
