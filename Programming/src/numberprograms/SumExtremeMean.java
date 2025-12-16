package numberprograms;
import java.util.Scanner;
public class SumExtremeMean {
	
	
	public static int digit(int n) {
		int num=1;
		int mean=0;
		while(n>10) {
			int rem=n%10;
			mean=rem*num+mean;
			num*=10;
			n/=10;
		}
		return mean;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp=n;
		int l=n%10;
		int s=0;
		while(temp>10) {
			s=temp/=10;
		}
//		System.out.println(s);
		int extrme=s*10+l;
//		System.out.println(extrme);
		
	
		
		int mean = digit(n/10);
//		System.out.println(mean);
		
		System.out.println(mean+extrme);
		
	}
}
