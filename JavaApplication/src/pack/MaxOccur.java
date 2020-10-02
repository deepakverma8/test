package pack;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MaxOccur {
	public static char count_characters(String text) {
		Map<String, Integer> map = new LinkedHashMap<>();

		String key = null;
		int value = 0;
		char c = (char) 0;
		int max = Integer.MAX_VALUE;
		if (text != null && text.length() > 0) {
		String[] strArr = text.split("");
		for (String str : strArr) {
		if (map.containsKey(str)) {
		map.put(str, map.get(str) + 1);
		} else {
		map.put(str, 1);
		}
		}
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
		String k = entry.getKey();
		int v = entry.getValue();

		if (value < v) {
		key = k;
		value = v;
		}
		}
		} else {
		return c;
		}

		return key.charAt(0);
		}
	public static String print(String input) {

		String result = "";
		String[] strArr = input.split(" ");

		for (String str : strArr) {

		List<String> list = Arrays.asList(str.split(""));

		int frequency = Collections.frequency(list, "t");
		if (frequency == 1 || frequency == 3) {
		Collections.reverse(list);

		result += str + " ";
		}

		}
		return result;
		}
	public static void main(String[] args) {
		//String my_str = "JoeErien";
		//String my_str = "aabcccdddbbddbb";
		
		//System.out.println("The occurence of every character in the string is "+count_characters(my_str));
		// approach 1
		
		String input = "taste the thunder";
		String result = "";
		String[] strArr = args;

		for (String str : strArr) {

		List<String> list = Arrays.asList(str.split(""));

		int frequency = Collections.frequency(list, "t");
		if (frequency == 1 || frequency == 3) {
		Collections.reverse(list);

		result += str + " ";
		}
		
		// String result = print(input); 
		 System.out.println(result);
		 for (int i = 0; i < args.length; i++) {
		 System.out.println(result.charAt(i));
		 }
		

		}}

}
