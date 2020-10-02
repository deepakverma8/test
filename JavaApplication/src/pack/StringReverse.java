package pack;

public class StringReverse {
	public static void main(String args[]) {
	//	String str = "Welcome to India Hello new India ";
		String str ="Welcome to Shubhabrata";
		String reverse="";
		String stringArray[]= str.split(" ");
		for(int pos=stringArray.length-1;pos>=0;pos--) {
			reverse = reverse+" "+stringArray[pos];
		}
		System.out.println(reverse);
	}

}
