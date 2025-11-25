package loops;
import java.util.*;

public class Example3 {
	
			public static void main(String args []) {
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter The Number: ");
				int n = sc.nextInt();
				
				int count = 1;
				do{
					System.out.println(count);
					count++;
				   }
				while(count<=n);
				sc.close();
	}
}
