package numberprograms;

import java.util.Scanner;

public class StrongNuminRange {

	public static int fact(int digit) {
		int fact=1;
		for(int i=digit; i>=1; i--) {
			fact*=i;
		}
		return fact;
	}
	 
	 
	 public static Boolean isStrong(int i) {
		 int rem=0;
			int sum=0;
			int n1=i;
			 while(i>0) {
				 rem=i%10; 
				 sum+=fact(rem);
				 i/=10;
				 	 
			 }
			 return sum==n1;
	 }
	 
	 public static int range(int n) {
		 for(int i=s; i<=e; i++) {
			 isStrong(i);
		 }
	 }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int s = sc.nextInt();
		System.out.println("Enter a Number");
		int e = sc.nextInt();
		

		if(isStrong(n)==true)System.out.println("Strong Number");
		else System.out.println("not a Strong number");
		sc.close();
	}
}
