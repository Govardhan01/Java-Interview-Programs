package String;

import java.util.Scanner;

public class UpperCase_To_LowerCase {
	
    public static void main(String[] args) {
	
    	    Scanner sc = new Scanner(System.in);
		
			System.out.print("Enter Name : ");
			
			String name = sc.next();
	        
			String str="";
			
			char ch;
			
			for(int i=0; i<name.length(); i++) {
				
				ch = name.charAt(i);
				
				if(Character.isUpperCase(ch)) {
					str += Character.toLowerCase(ch);
				}
				else  {
					str += Character.toUpperCase(ch);
				}	

			}
			
			System.out.println(str);
}

}
