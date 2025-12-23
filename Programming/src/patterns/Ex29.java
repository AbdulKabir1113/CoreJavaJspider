package patterns;

import java.util.Scanner;

public class Ex29 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		char c='A';
		for(int i=1; i<=2*n-1; i++) {
			
			for(int j=1; j<=2*n-1; j++) {
			
				if(i+j>=n+1 && i+j<=3*n-1 && j-i<=n-1 && i-j<=n-1) {
					
						System.out.print(c+++" ");
						if(c=='Z') {
							c='A';
						}
				}
				else System.out.print("  ");
			}
			System.out.println("  ");
		}
		sc.close();
	}
}
