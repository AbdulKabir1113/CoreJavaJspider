package numberprograms;
import java.util.*;
public class ProDigit {

			public static void fDigit(int n) {
				int rem=0;
				int sum=1;
				while(n>0) {
					rem = n % 10;
					sum*=rem;
					n/=10;
				}
				System.out.println(sum);
			}

			public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the number");
				int n = sc.nextInt();
				fDigit(n);
				sc.close();
			}
	}
