package numberprograms;

import java.util.Scanner;

public class SpyNumber {
	
	public static int digitSum(int n) {
		int rem=0;
		int sum=0;
		while(n>0) {
			rem = n % 10;
			sum+=rem;
			n/=10;
		}
		return(sum);
	}
	
	public static int digitProd(int n) {
		int rem=0;
		int prod=1;
		while(n>0) {
			rem = n % 10;
			prod*=rem;
			n/=10;
		}
		return(prod);
	}
	
	public static boolean isSpy(int n) {
		return digitSum(n)==digitProd(n);
	}
	

	public static void main(String args []) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		if(isSpy(n)) {
			System.out.println("SpyNumber");
		}else {
			System.out.println("Not a SpyNumber");
		}
		
	}
}
