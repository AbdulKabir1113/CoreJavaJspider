package patterns;

import java.util.Scanner;

public class Ex25 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		
//		for(int i=1; i<=n; i++) {
////			int c=n;
//			
//			for(int j=1; j<=n; j++) {
//				if(i%2==1)
//				System.out.print(j);
//				else System.out.print(c--);
//			}
//			System.out.println();
//		}
		int c=1;
		for(int i=1; i<=n; i++) {
		
		for(int j=1; j<=n; j++) {
			if(i%2==1)
			System.out.print(c++ +" ");
			else System.out.print(--c+ " ");
		}
		System.out.println();
	}
		
		sc.close();
	}
}
