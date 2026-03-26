package string;

public class FirstOccurenceUniuqe {

	public static void main(String[] args) {
		String str = "abacbbbdae";
	
//				for(int i = 0; i < str.length(); i++) {
//					int count = 0;
//					char ch = str.charAt(i);
//
//					for(int j = 0; j < str.length(); j++) {
//						if(str.charAt(j) == ch) {
//							count++;
//						}
		
		// optimize approach
//		if(str.charAt(j) == ch && i!=j) {
//			count++;
//			break;
//		}
//					}
//
//					if(count == 1) {
//						System.out.println("First unique character: " + ch);
//						break;
//					}
//				}
		
		

				for(int i = 0; i < str.length(); i++) {
					char ch = str.charAt(i);

					if(str.indexOf(ch) == str.lastIndexOf(ch)) {
						System.out.println("First unique character: " + ch);
						break;
					}
				}
		
	}
	
}
