package numberprograms;

import java.util.Scanner;

public class NumberFactorsExactlyEqualNumber {
	public static boolean isFactor(int i, int n) {
		
		for(i=1; i<=n; i++) {
			if(n%i==0) {
				System.out.println("Factors are: "+i);
			}
		}
		return 
	}

	public static void main(String args []) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int s = 1000;
		int e=10000;
		int n = sc.nextInt();
		
		for(int i=s; i<=e; i++) {
			if(isFactor(i,n));
		}
			
 }
}
