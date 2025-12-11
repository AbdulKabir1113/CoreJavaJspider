package numberprograms;
import java.util.Scanner;
public class Swap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n1 = sc.nextInt();
		System.out.println("Enter a number");
		int n2 = sc.nextInt();
		
//		int n3=n1;
//		n1=n2;
//		n2=n3;
//		n3=n1;
//		
//		System.out.println(n1);
//		System.out.println(n2);
		
		
//		n1=n1+n2;
//		n2=n1-n2;
//		n1=n1-n2;
//		
//		System.out.println(n1);
//		System.out.println(n2);
		
//		n1=n1*n2;
//		n2=n1/n2;
//		n1=n1/n2;
//		
//		System.out.println(n1);
//		System.out.println(n2);
		
		n1=n1^n2;
		n2=n1^n2;
		n1=n1^n2;
		
		System.out.println(n1);
		System.out.println(n2);
	
	}
}
