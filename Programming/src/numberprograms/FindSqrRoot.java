package numberprograms;
import java.util.*;
public class FindSqrRoot {
	
	public static int isSqrRoot(int n) {
		
		for(int i=1; i<n; i++) {
			if(i*i==n) return i;
		}
		return 0;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n= sc.nextInt();
		
		int sr=isSqrRoot(n);
		if(sr!=0) System.out.println(sr);
		else System.out.println("sqrroot noot found");
	}
}
