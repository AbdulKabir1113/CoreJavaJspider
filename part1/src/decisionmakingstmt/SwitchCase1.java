package decisionmakingstmt;
import java.util.Scanner;
public class SwitchCase1 {
	
		public static void main(String args []) {
			Scanner sc = new Scanner(System.in);
			System.out.print("A\nB\nC\nD\nE");
			char ch = sc.next().charAt(0);
			
			switch(ch) {
			case 'A','a': {
				System.out.println("A --> APPLE");
				break;
			}
			case 'B','b': {
				System.out.println("B --> BALL");
				break;
			}
			case 'C','c': {
				System.out.println("C --> CAT");
				break;
			}
			case 'D','d': {
				System.out.println("D --> DOG");
				break;
			}
			case 'E','e': {
				System.out.println("E --> EGG");
				break;
			}
			default:{
			
				System.out.println("Invalid Choice");
				
			}
			}
		}
	}
