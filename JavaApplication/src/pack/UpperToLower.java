package pack;

public class UpperToLower {
	public static void main(String args[]){
		//String selectedLineValue ="{Cisco 9971: BAT201C458A9000}1000096";
		String str ="Hello WOrld";
		String text ="Price: Rs.25000";
		System.out.println(text.substring(text.indexOf(".")+1));
		
		System.out.println(lowPrint(str));

		}
		public static String lowPrint(String str){

		String up="";
		String low ="";
		for(int i=0;i<str.length()-1;i++){
		char ch = str.charAt(i);
		if(ch>='A' && ch<='Z'){
		up = up+ch;
		}else{
		low = low+ch;
		}
		}
		return low+up;
		}
		

}
