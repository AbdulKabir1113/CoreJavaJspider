package numberprograms;
import java.util.Scanner;
public class Ex3 {

  
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			
			while(n!=1 && n!=4) {
				int sum=0;
				  int sqr=0;
				  while(n>0) {
					  int rem=n%10;
			          sqr=rem*rem;
			          sum+=sqr;
					  n/=10;  
				  }
				 n=sum;
				 
			}	
			if(n==1) System.out.println("Happy number");
			else System.out.println("not a happy number");
	}

}
