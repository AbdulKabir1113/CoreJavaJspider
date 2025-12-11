package numberprograms;
import java.util.Scanner;

public class FibbSeries {

		public static void main(String[] args) {
			Scanner sc=new Scanner (System.in);
			System.out.println("enter numder");
			int n= sc.nextInt();
			fibonocciSeries(n);
		}
		 
		public static void fibonocciSeries(int n) {
			int n1=0;
			int n2=1;

			for(int i=0;i<n;i++) {
				
				System.out.println(n1);
				int n3=n1+n2;
				n1=n2;
				n2=n3;	

			
			}
		}
}
