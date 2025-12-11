package numberprograms;
import java.util.Scanner;

public class Demo {
	public static void method(int n) {
		System.out.println(" ");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = sc.nextInt();
		
		method(n);
		sc.close();
	}
}
