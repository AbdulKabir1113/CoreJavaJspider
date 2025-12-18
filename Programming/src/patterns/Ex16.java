package patterns;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n= sc.nextInt();
		
//		int row=n;
//		int col=2*n-1;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=2*n-1; j++) {
				if(i+j>=n+1 && j-i<=n-1) System.out.print("* ");
				else System.out.print("  ");
			}
			System.out.println();
		}
		sc.close();
	}
}
