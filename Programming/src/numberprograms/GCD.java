package numberprograms;

import java.util.Scanner;

public class GCD {
	
	public static int gcd(int n1,int n2) {
		int gcd=0;
		for(int i=1; i<=n1 && i<=n2; i++) {
			if(n1%i==0 && n2%i==0) {
				gcd=i;
			}
		}
		return gcd;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the frst number");
		int n1 = sc.nextInt();
		System.out.println("Enter the 2nd number");
		int n2 = sc.nextInt();
		
	    System.out.println(gcd(n1,n2));
	    sc.close();
	}
}
