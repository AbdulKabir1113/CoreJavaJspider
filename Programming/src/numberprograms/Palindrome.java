package numberprograms;
import java.util.Scanner;
public class Palindrome {
	public static int isPalindrome(int n) {
		int rem = 0;
		int num=0;
		while(n>0) {
			rem=n%10;
			num=rem+num*10;
			n/=10;
			
		}
		return num;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		
		if(isPalindrome(n)==n) System.out.println(n+" is Palindrome");
		else System.out.println(n+" is Not a Palindrome");
		sc.close();
	}
}
