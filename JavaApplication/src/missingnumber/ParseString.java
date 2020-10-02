package missingnumber;

public class ParseString {
	public static void main(String args[]) {
		String selectedLineValue ="{Cisco 9971: BAT201C458A9000}1000096";
		System.out.println(selectedLineValue);
		String newStr = "";
		if(selectedLineValue.contains("}") && selectedLineValue.contains("/")) {
		newStr = selectedLineValue.substring(selectedLineValue.indexOf('}')+1, selectedLineValue.indexOf('/'));
		} else {
		newStr = "Second : "+selectedLineValue.substring(selectedLineValue.indexOf('}')+1);
		}
		System.out.println(newStr);

		}
	

}
