package String;

import java.util.Scanner;

public class Revers_String {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Name : ");
		
		String name = sc.next();

		char ch ;
		
		String str="";
		
		for(int i=0; i<name.length(); i++) {
			ch = name.charAt(i);
			 str = ch + str;
			
		}
		System.out.println(str);
	}

}
