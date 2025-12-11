package numberprograms;

import java.util.Scanner;

public class Power {

	public static int power(int n,int p) {
		int pow=1;
		for(int i=1; i<=p; i++) {
			pow*=n;
		}
		return pow;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a N");
		int n = sc.nextInt();
		System.out.println("Enter a P");
		int p = sc.nextInt();
		
		System.out.println(power(n,p));
		sc.close();
	}
}
