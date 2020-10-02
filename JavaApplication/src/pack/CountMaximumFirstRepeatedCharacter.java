package pack;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CountMaximumFirstRepeatedCharacter {
	static void count_characters(String input_str) {
		
		int maxCount =0;
		String key="";
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		char[] charAray = input_str.toCharArray();
		for (char c : charAray) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}

	/*	for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
			
		}*/
	for (Map.Entry<Character, Integer> entry : map.entrySet()) {

		if (entry.getValue() > maxCount) {
			maxCount = entry.getValue();
			key = entry.getKey().toString();
		}
	}
	System.out.println(key+"="+maxCount);
			
	}
	
	public static void main(String[] args) {
		//String my_str = "JoeErien";
		String my_str = "aabcccdddbbddbb";
		
		System.out.println("The occurence of every character in the string is ");
		count_characters(my_str);
	}

}
/*
 
 Iterator<Entry<Character, Integer>> it = map.entrySet().iterator();
		// iterating every set of entry in the HashMap. 
		while (it.hasNext()) {
			Map.Entry<Character, Integer> set = (Map.Entry<Character, Integer>) it.next();
			System.out.println(set.getKey());
			if(set.getKey().toString().equals("e")){
				System.out.println(set.getKey() + " = " + set.getValue());
				
			}
		}
*/