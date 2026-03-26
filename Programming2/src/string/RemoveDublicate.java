package string;

public class RemoveDublicate {

	public static void main(String[] args) {
//		String str = "Banana";
//		String str1 = "";
//
//		for(int i = 0; i < str.length(); i++) {
//			char ch = str.charAt(i);
//
//			if(!str1.contains(ch + "")) {   
//				str1 += ch;
//			}
//		}
//
//		System.out.println(str1);
		
		//2nd method
		String str = "Banana";
		String result = "";

		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if(result.indexOf(ch) == -1) {
				result += ch;
			}
		}

		System.out.println(result);
	}
}
