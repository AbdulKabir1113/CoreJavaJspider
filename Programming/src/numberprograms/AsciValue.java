package numberprograms;

import java.util.Scanner;

public class AsciValue {
	public static int charToAscii(char i) {
		return (int)i;
	}
 
	public static void main(String args []) {
		
		
//		char c = 'A';
//		for(int i=65; i<=90; i++) {
//			
//			System.out.println(c+" "+i);
//			c++;
//		}
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the starting Alphabet");
		char s = sc.next().charAt(0);
		System.out.println("Enter the ending Alphabet");
		char e = sc.next().charAt(0);
		
		for(char i=s; i<=e; i++) {
			System.out.println(i+ "-->" + charToAscii(i));
		}
		
	}
}
