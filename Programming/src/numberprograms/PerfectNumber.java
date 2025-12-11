package numberprograms;
import java.util.Scanner;
public class PerfectNumber {
	
	public static void range(int s,int e) {
		for(int i=s; i<=e; i++) {
			if(perfectNum(i)==i) System.out.println(i);
		}	
	}

	
	public static int perfectNum(int n) {
		int sum=0;
		for(int i=1; i<=n/2; i++) {
			if(n%i==0) {
//				System.out.println("Factors are: "+i);
				sum+=i;
			}
		}	
			return sum;
}
	
	public static void main(String args []) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int s = sc.nextInt();
		System.out.println("Enter a number: ");
		int e = sc.nextInt();
		
		range(s,e);
		
//		if(perfectNum(n)) System.out.println("perfect Number");
//		else System.out.println("not perfect Number");

 }
}