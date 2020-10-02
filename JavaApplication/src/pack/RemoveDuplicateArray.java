package pack;

import java.util.Arrays;

public class RemoveDuplicateArray {
	public static void main(String args[]) {
		int arr[]= {1,2,8,7,4,2,3,4,3,6,5,9,8,0};
		
		Arrays.parallelSort(arr);
		StringBuffer sb=new StringBuffer();
		sb.append(arr[0]);
		for(int i=1;i<arr.length;i++) {
			if(arr[i]!=arr[i-1]) {
				sb.append(arr[i]);
			}
			
		}
		System.out.println(sb.toString());
	}

}
