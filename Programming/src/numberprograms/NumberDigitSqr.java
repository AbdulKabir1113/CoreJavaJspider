package numberprograms;
import java.util.Scanner;

public class NumberDigitSqr {

		public static void fetchDigit(int n) {
			int rem=0;
			int sum=0;
			int sqr =0;
			while(n>0) {
				rem = n % 10;
				sqr=rem*rem;
				System.out.println(rem+" Digit Sqr " +sqr);
				sum+=sqr;
				n/=10;	
			}	
			System.out.println("Sum of Digit Sqr "+sum);
		}
		

		public static void main(String args []) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a Number");
			int n = sc.nextInt();
			
			fetchDigit(n);
			
				
	 }
}
