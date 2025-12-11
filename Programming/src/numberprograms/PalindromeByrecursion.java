package numberprograms;
import java.util.Scanner;
public class PalindromeByrecursion {
	public static int isPalindrome(int n,int rev) {
		if(n>0) {
			int rem=n%10;
			rev=rem+rev*10;
			n/=10;
			return isPalindrome(n,rev);
		}
		
		else
			return rev;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int rev=0;
		
		if(isPalindrome(n,rev)==n) System.out.println(n+" is Palindrome");
		else System.out.println(n+" is Not a Palindrome");
		sc.close();
	}
}
