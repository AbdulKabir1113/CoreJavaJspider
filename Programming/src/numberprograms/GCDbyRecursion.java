package numberprograms;

import java.util.Scanner;

public class GCDbyRecursion {

	public static int gcd(int n1,int n2,int i,int gcd) {
		
		if(i<=n1 && i<=n2){
			if(n1%i==0 && n2%i==0){
				gcd=i;
			}
			return gcd(n1,n2,i+1,gcd);
		}else {
		return gcd;
		}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the frst number");
		int n1 = sc.nextInt();
		System.out.println("Enter the 2nd number");
		int n2 = sc.nextInt();
		
	    System.out.println(gcd(n1,n2,1,0));
	    sc.close();
	}
}
