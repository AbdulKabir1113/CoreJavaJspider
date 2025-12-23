package patterns;

import java.util.Scanner;

public class Ex24 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			int c=i;
			for(int j=1; j<=2*n-1; j++) {
				if(i+j>=n+1 && j-i<=n-1) System.out.print(c++ +" ");
				else System.out.print("  ");
			}
			System.out.println("  ");
		}
		sc.close();
	}
}
