package Array;

public class CountCharNoSChar {

	public static void main(String[] args) {
		
		char c[] = {'1','e','9','d','*','@','u'};
		int alp=0;
		int no=0;
		int sChar=0;
		
//		for(int i=0; i<c.length; i++) {
//			if((c[i] >= 'A' && c[i]<='z') || (c[i]>= 'a' && c[i]<='z')) alp++;
//			else if(c[i] >= '0' && c[i]<='9') no++;
//			else sChar++;
//		}
		
		for(int i = 0; i < c.length; i++) {
		    if(Character.isLetter(c[i])) 
		        alp++;
		    else if(Character.isDigit(c[i])) 
		        no++;
		    else 
		        sChar++;
		}
		
		System.out.println("Number Count: " + no + "\nAlphabets Count: "+ alp + "\nSpecial Charatrcter Count: "+sChar);
	}
}
