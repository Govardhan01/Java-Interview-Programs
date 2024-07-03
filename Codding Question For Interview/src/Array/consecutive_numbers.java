package Array;

import java.util.Arrays;

public class consecutive_numbers {
	
	public static void main(String[] args) {
		
        int [] array = {1, 3, 6, 10, 15}; 
        
        int newArrayLength = array.length - 1;
        
        int[] differences = new int[newArrayLength];
        
       
       for (int i = 0; i < newArrayLength; i++) {
            differences[i] = array[i + 1] - array[i]; // Differnce between two consecutive numbers
            
//            differences[i] = array[i + 1] + array[i]; // Addintion between two consecutive numbers

        }
        
        System.out.println(Arrays.toString(differences));

		
	}

}
