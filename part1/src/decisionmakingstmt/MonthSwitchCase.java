package decisionmakingstmt;
import java.util.Scanner;

public class MonthSwitchCase {

	
	
		
			public static void main(String args []) {
				Scanner sc = new Scanner(System.in);
				System.out.print("JAN\nFEB\nMARCH\nAPRIL\nMAY\nJUNE\n");
				System.out.print("JULY\nAUG\nSEP\nOCT\nNOV\nDEC");
				String ch = sc.next().toUpperCase();
				
				switch(ch) {
				case "JAN": {
					System.out.println("31");
					break;
				}
				case "FEB": {
					System.out.println("28 OR 29");
					break;
				}
				case "MARCH": {
					System.out.println("31");
					break;
				}
				case "APRIL": {
					System.out.println("30");
					break;
				}
				case "MAY": {
					System.out.println("31");
					break;
				}
				case "JUNE": {
					System.out.println("30");
					break;
				}
				case "JULY": {
					System.out.println("31");
					break;
				}
				case "AUG": {
					System.out.println("31");
					break;
				}
				case "SEP": {
					System.out.println("30");
					break;
				}
				case "OCT": {
					System.out.println("31");
					break;
				}
				case "NOV": {
					System.out.println("30");
					break;
				}
				case "DEC": {
					System.out.println("31");
					break;
				}
				default:{
				
					System.out.println("Invalid Choice");
					
				}
				}
			}
		}


