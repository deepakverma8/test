package pack;

import java.util.Arrays;

public class RemoveDuplicateString {
	public static void main(String args[]) {
		String str="ABCDAEFGHAD";
		char ch[]=str.toCharArray();
		Arrays.parallelSort(ch);
		StringBuffer sb=new StringBuffer();
		sb.append(ch[0]);
		for(int i=1;i<ch.length;i++) {
			if(ch[i]!=ch[i-1]) {
				sb.append(ch[i]);
			}
			
		}
		System.out.println(sb.toString());
	}

}
