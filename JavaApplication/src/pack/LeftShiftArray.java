package pack;



public class LeftShiftArray {
	public static void main(String args[]) {
		int arr[]= {1,2,8,7,6,0,5};
		int temp= arr[0];
		for(int i=0;i<arr.length-1;i++) {
			arr[i]=arr[i+1];
		}
		arr[arr.length-1]=temp;
		
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}
		
		
	}

}
