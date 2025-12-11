package numberprograms;
import java.util.Scanner;
public class HarshadNumbder {
	public static boolean isHarshad(int n) {
		int sum=0;
		int temp=n;
		while(n>0) {
			int rem=n%10;
			sum+=rem;
			n/=10;
		}
		if(temp%sum==0) return true;
		else return false;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if(isHarshad(n)) System.out.println("Harshad number");
		else System.out.println("Not a harshad Number");
	}

}
