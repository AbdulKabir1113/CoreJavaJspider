package loops;
import java.util.*;

public class Example {

				public static void main(String args []) {
					Scanner sc = new Scanner(System.in);
					System.out.println("Enter The Number: ");
					int n = sc.nextInt();
					
					int count =  n;
					do{
						System.out.println(count);
						count--;
					   }
					while(count>=1);
					sc.close();
	}
}

