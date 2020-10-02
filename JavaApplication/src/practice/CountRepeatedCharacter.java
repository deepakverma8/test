package practice;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountRepeatedCharacter {
	public static void main(String args[]) {
		Map<Character,Integer> map = new LinkedHashMap<Character,Integer>();
		String str = "count hello world ";
		char ch[] = str.toCharArray();
		for(int i=0;i<ch.length-1;i++) {
			Integer count = (Integer)map.get(ch[i]);
			if(map.containsKey(ch[i])) {
				map.put(ch[i], count+1);
			}
			else {
				map.put(ch[i], 1);
			}
		}
	//	System.out.print(map);
		for(Map.Entry<Character, Integer> entry: map.entrySet()) {
			/*
			 * if(entry.getKey().toString().equalsIgnoreCase("O")){
			 * System.out.print(entry.getValue()); }
			 */
			System.out.println(entry.getKey()+"="+entry.getValue());
		}
	}

}
