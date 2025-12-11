package numberprograms;
import java.util.Scanner;
public class NeonNumver {
	public static boolean isNeon(int n) { 
		int rem=0;
		int sum=0;
		int n1=n*n;
		
		while(n1>0) {
			rem=n1%10;
			sum+=rem;
			n1/=10;
		}
		if(sum==n) return true;
		else return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		if(isNeon(n)) System.out.println("Neon Number");
		else System.out.println("Not a Neon Number");
		sc.close();
	}
}
