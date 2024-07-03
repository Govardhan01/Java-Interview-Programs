package String;

import java.util.HashMap;

public class NoOf_repetade_Char {
	
	public static void main(String[] args) {
		
		String s = "Banana";
		
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(int i = 0; i<s.length(); i++) {
			
			char ch = s.charAt(i);
			
			Integer value = map.get(ch);
			
			if(value != null) {
				map.put(ch, new Integer(value+1));
			}else {
				map.put(ch, 1);
			}
		}
		 System.out.println(map);

	}

}
