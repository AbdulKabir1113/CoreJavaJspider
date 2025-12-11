package numberprograms;

import java.util.Scanner;

public class StrongNumber {

	public static int fact(int digit) {
		int fact=1;
		for(int i=digit; i>=1; i--) {
			fact*=i;
		}
		return fact;
	}
	 
	 
	 public static Boolean isStrong(int n) {
		 int rem=0;
			int sum=0;
			int n1=n;
			 while(n>0) {
				 rem=n%10; 
				 sum+=fact(rem);
				 n/=10;
				 	 
			 }
			 return sum==n1;
	 }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = sc.nextInt();
		

		if(isStrong(n)==true)System.out.println("Strong Number");
		else System.out.println("not a Strong number");
		sc.close();
	}
}
