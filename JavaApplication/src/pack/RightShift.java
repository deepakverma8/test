package pack;

public class RightShift {
	public static void main(String args[]) {
		int arr[]= {1,2,8,7,6,0,5};
		int temp= arr[arr.length-1];
		for(int i=0;i<=2;i++) {
		for(i=arr.length-1;i>0;i--) {
			arr[i]=arr[i-1];
		}
		arr[i]=temp;
		}
		
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}
		
		
		
	}
}
