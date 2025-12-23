package patterns;

import java.util.Scanner;

public class Ex27 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		
		char count='A';
//		for(int i=1; i<=n; i++) {
//			for(int j=n; j>=1; j--) {	
//					if(i==1 || i==n || i==j) System.out.print("Z");
//					else System.out.print(count++);
//			}
//			System.out.println("  ");
//		}
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {	
					if(i==1 || i==n || i+j==n+1) System.out.print("Z"+" ");
					else System.out.print(count+++" ");
			}
			System.out.println("  ");
		}
		
		sc.close();
	}
}
