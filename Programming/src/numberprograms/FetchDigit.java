package numberprograms;
import java.util.*;
public class FetchDigit {
	public static void fDigit(int n) {
		int rem=0;
		int count=0;
		while(n>0) {
//			rem = n % 10;
			
//			System.out.println(rem);
			n/=10;
			count++;
		}
		System.out.println("Number iof digit is "+count);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		fDigit(n);
		sc.close();
	}
}
