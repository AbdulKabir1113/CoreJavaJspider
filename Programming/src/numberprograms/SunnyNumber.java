package numberprograms;
import java.util.Scanner;
public class SunnyNumber {

	public static int sunnyNum(int n) {
		int a=0;
		for(int i=1; i<=n; i++) {
			if(i*i==n) {
				a=i;
				break;
			}
 
		}
		return a;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		
	    if(sunnyNum(n+1)==0) {
	    	System.out.println("not sunny  number");
	    }else {
	    	System.out.println("sunny number");
	    }
	}
}
