package numberprograms;
import java.util.Scanner;
public class Automorphic {
	public static int automorphic(int n) {
		int p=1;
		while(n>0) {
			p*=10;
			n/=10;
		}
		return p;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int n = sc.nextInt();
		int sqr=n*n;
		
		int p=automorphic(n);
		if(sqr%p==n) System.out.println("Automorphic number");
		else System.out.println("not a automorphic number");
		
		
	}
}
