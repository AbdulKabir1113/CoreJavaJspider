package numberprograms;

import java.util.Scanner;

public class RangeMultiplication {

	public static void main(String args []) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the stating number");
		int s = sc.nextInt();
		System.out.println("Enter the ending number");
		int e = sc.nextInt();
		
		for(int i=s; i<=e; i++) {
			for(int j=1; j<=10; j++) {
				System.out.println(i+" * "+j+" = "+i*j);
			}
			System.out.println("*******************");
		}
		
		
	}
}
