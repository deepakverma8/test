package pack;

public class SwapFirstAndLastString {


	
		public static void main(String[] args) {
			String s = "Subhash is Great the Good";
			String str[] = s.split(" ");
			int j= str.length-1;
			String reverse ="";
			String temp = str[0];
			str[0] =str[j];
			str[j] = temp;
			for(int i=0;i<=str.length-1;i++){
				reverse = reverse +str[i] +" ";
			}
			System.out.println(reverse);
		
			
		}
}
