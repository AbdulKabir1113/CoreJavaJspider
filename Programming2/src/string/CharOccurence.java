package string;

import java.util.Arrays;

public class CharOccurence {

	public static void main(String[] args) {
//		String str = "Programming";
		
//		char ch[] = str.toCharArray();
//		
//		System.out.println(Arrays.toString(ch));
//		
//		
//		int visit[] = new int[ch.length];
//	
//
//	    
//	    for(int i=0; i<ch.length; i++) {
//	    	int c=1;
//	    	if(visit[i]!=1) {
//	    		for(int j=i+1; j<ch.length; j++) {
//	    			if(ch[i]==ch[j]) {
//	    				c++;
//	    				visit[j]=1;
//	    			}
//	    		}
//	    		
//	    		System.out.println(ch[i]+"->"+c);
//	    	}
//	    	
//	    }
		// 2nd method
//		String str = "Programming";
//		String visited = "";
//		
//		for(int i=0; i<str.length(); i++) {
//			int c = 0;
//			char ch = str.charAt(i);
//			
//			if(!visited.contains(ch+"")) {
//				for(int j=0; j<str.length();j++) {
//					if(str.charAt(j) == ch) {
//						c++;
//					}
//					
//				}
//				System.out.println(ch+"->"+c);
//				visited+=ch;
//			}
//		}
		
		// 3rd method
				String str = "Programming";
				String visited = "";
				
				for(int i=0; i<str.length(); i++) {
					int c = 0;
					char ch = str.charAt(i);
					
					if(visited.indexOf(ch )==-1) {
						for(int j=0; j<str.length();j++) {
							if(str.charAt(j) == ch) {
								c++;
							}
							
						}
						System.out.println(ch+"->"+c);
						visited+=ch;
					}
				}
	}
}
