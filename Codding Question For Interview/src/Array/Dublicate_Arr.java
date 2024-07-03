package Array;

public class Dublicate_Arr {
	
	public static void main(String[] args) {
		
		int ar1[]= {1,8,6,7,5};
		int ar2[]= {8,6,7,5};
		
		for(int i=0; i<5; i++) {
		    
			for(int j=0; j<4; j++) {
				
				if(ar1[i] == ar2[j]) {
					System.out.print(ar1[i]);
					
				}
			}
		}
		
		
		
		}

}
