package String;

public class Reverce01 {
	
	public static void main(String[] args) {
		
		String  name = "Sourabh";
		String str="";
		
		char ch;
		
		for(int i=0; i<name.length(); i++) {
			
			ch = name.charAt(i);
			
			str = ch + str;
			
		}
		
		System.out.println(str);
		
	}

}
