package patterns;

import java.util.Scanner;

public class Ex28 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			char c=(char)('A'+n-1);
			for(int j=1; j<=i; j++) {
			
				System.out.print(c--+" ");
			}
			System.out.println("  ");
		}
		sc.close();
	}
}
