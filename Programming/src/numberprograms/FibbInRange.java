package numberprograms;
import java.lang.String;
import java.util.Scanner;

public class FibbInRange {
		public static void main(String[] args) {
			Scanner sc=new Scanner (System.in);
			System.out.println("enter starting range");
			int n= sc.nextInt();
			System.out.println("enter ending range");
			int end= sc.nextInt();
			
			for(int i=n;i<=end;i++) {
				
				System.out.print("Fibonacci of  "+i+"  is   ");
				fibonacciSeries(i);
			}
		}
		
		public static void fibonacciSeries(int n) {
			int n1=0;
			int n2=1;

			for(int i=0;i<n;i++) {
				
				System.out.print(" "+n1);
				int n3=n1+n2;
				n1=n2;
				n2=n3;	

			}
			System.out.println();
		}
	
}
