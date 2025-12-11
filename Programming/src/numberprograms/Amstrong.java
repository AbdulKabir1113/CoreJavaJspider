package numberprograms;
import java.util.Scanner;
public class Amstrong {
	
	public static int count(int n) {
		int count=0;
		while(n>0) {
			int rem=n%10;
			n/=10;
			count++;
		}
		
		return count;
	}
	public static int power(int digit,int count) {
		int pow=1;
		for(int i=1; i<=count; i++) {
			pow*=digit;
		}
		
		return pow;
	}
	
	public static boolean isAmstrong(int n) {
		int sum=0;
		int count = count(n);
		int n1=n;
		while(n!=0) {
			int digit=n%10;
			sum+=power(digit,count);
			n/=10;
		}
		return sum==n1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		
		
		if(isAmstrong(n)) System.out.println("Amnstrong Number");
		else System.out.println("Not a Amstrong Number");
	}
}
