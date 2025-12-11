package numberprograms;
import java.util.Scanner;
public class PrimeRecursion {

		public static int factor(int n,int i) {
			
			if(i>n) return 0;
			
			if(n%i==0) {
//				System.out.println(i);
//				return factor(n,i+1);
				return 1+factor(n,i+1);
			}else {
				return factor(n,i+1);
			}		
		}
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter a Number: ");
			int n = sc.nextInt();
			
			System.out.println(factor(n,1));
			sc.close();
		}
}
