package numberprograms;

import java.util.Scanner;

public class LargestDigit {

	public static void fLargestDigit(int n) {
		int rem=0;
		int sn=0;
		while(n>0) {
			rem = n % 10;
			if(sn<rem) {
				sn=rem;
			}
			n/=10;	
		}
		System.out.println("Largest Number: "+sn);
		
	}
		
		public static void main(String args []) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a Number");
			int n = sc.nextInt();
			fLargestDigit(n);
			
			sc.close();
		}
}
