package numberprograms;
import java.util.Scanner;

public class SplitNoin2Parts {	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int temp=n;
		int count=0;
		while(n>0) {
			count++;
			n/=10;
		}
		
        int p=1;	
		for(int i=1; i<=count/2; i++) {
			p*=10;
		}
		
		int s=temp%p;
		int f=temp/p;
		
		System.out.println(f+"\n"+s);
		
		
		
		
	}
}
