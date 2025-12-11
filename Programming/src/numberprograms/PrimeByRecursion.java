package numberprograms;
import java.util.Scanner;
public class PrimeByRecursion {
	public static boolean isPrime(int n,int i) {
		if(n<=1) return false;
		
		if(i*i>n) return true;
//		if(i>n/2) return true;
		
		if(n%i==0) return false;
		
		return isPrime(n,i+1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int n = sc.nextInt();

		if(isPrime(n,2)) System.out.println(n+ " is Prime");
		else System.out.println(n+ " not a Prime");
		
		sc.close();
	}
}
