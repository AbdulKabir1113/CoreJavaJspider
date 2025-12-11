package numberprograms;
import java.util.Scanner;
public class SumDigitUntilSingleDigit {
	public static int sumDigit(int n) {
		int sum=0;
		while(n>0) {
			int rem=n%10;
			
				sum+=rem;
			
			n/=10;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		while(n>9) {
			n = sumDigit(n);
		}
		System.out.println(n);
	}

}
