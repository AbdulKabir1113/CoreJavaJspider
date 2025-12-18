package patterns;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n= sc.nextInt();
		
		int col=n;
		int row=2*n-1;
		for(int i=1; i<=row; i++) {
			for(int j=1; j<=col; j++) {
				if(i+j<=row+1 && i>=j) System.out.print("* ");
				else System.out.print("  ");
			}
			System.out.println();
		}
		sc.close();
	}
}
