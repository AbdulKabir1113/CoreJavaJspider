package numberprograms;

import java.util.Scanner;

public class NeonNumRange {
	public static void range(int s,int e) {
		for(int i=s; i<=e; i++) {
			if(isNeon(i)) System.out.println(i);
		}
		
	}

	public static boolean isNeon(int n) { 
		int rem=0;
		int sum=0;
		int n1=n*n;
		
		while(n1>0) {
			rem=n1%10;
			sum+=rem;
			n1/=10;
		}
		if(sum==n) return true;
		else return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a starting number: ");
		int s = sc.nextInt();
		System.out.print("Enter a ending number: ");
		int e = sc.nextInt();
		
		range(s,e);
		sc.close();
	}
}
