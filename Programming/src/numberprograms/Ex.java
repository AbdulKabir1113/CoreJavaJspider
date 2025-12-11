package numberprograms;
import java.util.Scanner;
public class Ex {
	public static int count(int n) {
		int count=0;
		
		while(n>0) {
			count++;
			n/=10;
		}
		return count;
	}
	
	public static int sum(int n) {
		int sum=0;
		int c=count(n);
		while(n>0) {
			int rem=n%10;
			sum+=power(rem,c);
			c--;
			n/=10;
		}
		return sum;
	}
	
	public static int power(int rem,int count) {
		int p=1;
		
		for(int i=1; i<=count; i++) {
			p*=rem;
		}
		return p;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println(sum(n)); 
	}
}
