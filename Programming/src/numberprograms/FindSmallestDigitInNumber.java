package numberprograms;

import java.util.Scanner;

public class FindSmallestDigitInNumber {

	public static void fDigit(int n) {
		int rem=0;
		int sn=n;
		while(n>0) {
			rem = n % 10;
			if(sn>rem) {
				sn=rem;
			}
			n/=10;	
		}
		System.out.println("Smallest Number: "+sn);
		
	}
		
		public static void main(String args []) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a Number");
			int n = sc.nextInt();
			fDigit(n);
		}
	
	
}
