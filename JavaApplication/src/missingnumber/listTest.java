package missingnumber;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class listTest {public static void main(String[] args) {
	List<String> list = Arrays.asList("B", "A", "A", "C", "B", "A");
	Set<String> distinct = new HashSet<>(list);
	for (String s : distinct) {
	if(s.equals("B")){
	System.out.println(s + ": " + Collections.frequency(list, s));
	}
	
	



	}
	String s1 = "Welcome to geeksforgeeks Lord Krishna"; 
	String[] temp = s1.split(" "); 
	String result = ""; 
	  
    // Iterate over the temp array and store 
    // the string in reverse order. 
    for (int i = 0; i < temp.length; i++) { 
        if (i == temp.length - 1) 
            result = temp[i] + result; 
        else
            result = " " + temp[i] + result; 
    } 
    System.out.println(result);
}

}
