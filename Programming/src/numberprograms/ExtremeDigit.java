package numberprograms;
import java.util.Scanner;
public class ExtremeDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp=n;
		int count=0;
		while(n>0) {
			count++;
			n/=10;
		}
		
		int c=count-1;
		int l=temp%c;
		int s=temp%10;
		
		
		
		System.out.println(l);
		System.out.println(s);
		
		int sum=s+l;
		System.out.println(sum);
	}
}
