package decisionmakingstmt;
import java.util.Scanner;


public class SwithCase {
	public static void main(String args []) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1\n2\n3\n4\n5");
		int ch = sc.nextInt();
		
		switch(ch) {
		case 1: {
			System.out.println("1 --> ONE");
			break;
		}
		case 2: {
			System.out.println("2 --> TWO");
			break;
		}
		case 3: {
			System.out.println("3 --> THREE");
			break;
		}
		case 4: {
			System.out.println("4 --> FOUR");
			break;
		}
		case 5: {
			System.out.println("5 --> FIVE");
			break;
		}
		default:{
		
			System.out.println("Invalid Choice");
			
		}
		}
	}
}
