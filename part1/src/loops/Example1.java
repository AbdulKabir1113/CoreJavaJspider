package loops;
import java.util.*;

public class Example1 {
 
	public static void main(String args []) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number: ");
		int n = sc.nextInt();
		
		int count = 1;
		while(count<=n) {
			System.out.println(count+"-> *");
			count++;
		}
		sc.close();
	}
}
