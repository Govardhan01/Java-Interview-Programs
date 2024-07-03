package Array;


public class Duplicate_ar2 {
	
	
	public static void main(String[] args) {
		
		int ar[]= {2,5,8,4,2,8,8,2};
	 
		  
		  for(int i=0; i<ar.length; i++) {
			  
			  for(int j=i+1; j<ar.length; j++) {
				  
				  if(ar[i] == ar[j]) {
					  
					  
					  System.out.println(ar[j]);
				  }
			  }
		  }
		
		
		 
	}

}
