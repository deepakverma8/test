package missingnumber;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MissingNumber {
	public static void main(String args[]) {
		 Integer iArray[] = {2,5,8,10,15};
		// Arrays.parallelSort(iArray);
		 List<Integer> list = Arrays.asList(iArray );
			int start = iArray[0];
			int end = iArray[iArray.length-1];
			
			for(int i=start;i<end;i++) {
				if(!list.contains(i)) {
					System.out.println(i+ " ");
				}
				
			}
		
	//	 missingArray(iArray);
	}
	

}
