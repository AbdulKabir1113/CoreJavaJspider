package codingquestions;
import java.util.*;
public class OddNumSum {
	public static int oddSum(int s,int e) {
		int sum = 0;
		for(int i=s; i<=e; i++) {
			if(i%2!=0) {
				System.out.print(i+",");
				sum+=i;
			}
		}
		return sum;
	}

	public static void main(String args []) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the starting number of range");
		int s = sc.nextInt();
		System.out.println("Enter the ending number of range");
		int e = sc.nextInt();
		
		System.out.println("\nSum of odd number is: "+oddSum(s,e));
		sc.close();
	}
}
