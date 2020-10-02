package pack;

class ReverseStringATSamePosition {
	public static void main(String args[]) {
				String s = "Subhash is Great time";
		  char[] ch = s.toCharArray(); 
	        for (int i = 0; i < ch.length; i++) { 
	  
	            // k stores index of first character 
	            // and i is going to store index of last  
	            // character.  
	            int k = i; 
	            while (i < ch.length && ch[i] != ' ')  {
	                i++; 
	            }           
	            // Swapping 
	            char temp = ch[k]; 
	            ch[k] = ch[i - 1]; 
	            ch[i - 1] = temp; 
	  
	            // We assume that there is only one space 
	            // between two words. 
	        } 
	        System.out.println(new String(ch)); 
	}

}
