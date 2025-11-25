package numberprograms;
import java.util.*;

public class CheckUperLowercase {
	public static void main(String args []) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Alphabet");
		char c = sc.next().charAt(0);
		
		if(c>='A' && c<='Z') {
				System.out.println("UpperCase");	
		}else {
			System.out.println("LowerCase");
		}
		
	}

}
