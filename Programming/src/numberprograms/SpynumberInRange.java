package numberprograms;

import java.util.Scanner;

public class SpynumberInRange {

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
		System.out.println("Enter Starting Number");
		int s = sc.nextInt();
		System.out.println("Enter Ending Number");
		int e = sc.nextInt();
		
		for(int i=s; i<=e; i++) {
			if(isSpy(i)) {
				System.out.println(i+" SpyNumber");
			}else {
				System.out.println(i+" Not a SpyNumber");
			}
			
		}
			sc.close();
      }
}
