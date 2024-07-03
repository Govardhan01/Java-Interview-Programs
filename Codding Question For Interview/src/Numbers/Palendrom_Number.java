package Numbers;

public class Palendrom_Number {

	public static void main(String[] args) {
		
		int rem,rev=0,num = 12321;
		int temp = num;
		
		while(num>0) {
			
			rem = num % 10;
			
			num = num / 10;
			
			rev = rev * 10 +rem;
			
		}
		 if(temp == rev) {
			 System.out.println("Number in palendrom");
		 }else {
			 System.out.println("Number in not palendrom");

		 }
	}
	
}
