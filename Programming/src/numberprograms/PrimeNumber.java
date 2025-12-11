package numberprograms;
import java.util.*;

public class PrimeNumber {

		public static void main(String args []) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number");
			int n = sc.nextInt();
			int count=0;
			for(int i=1; i<=n; i++) {
				if(n%i==0) {
					count+=i;
				}
			}
			
//			for(int i=2; i<n; i++) {
//				if(n%i==0) 
//					return false;
//			}
//			return true;
			
			for(int i=2; i<=n/2; i++) {
//				if(n%i==0) 
//					return false;
//			}
//			return true;
			
			if(count==2) {
				System.out.println("Prime Number");
			}else {
				System.out.println("Not a Prime Number");
			}
		}
		}
}


