package numberprograms;

import java.util.Scanner;

public class DecimaltoOctal {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    String res="";
	    while(n>0) {
	    	int rem=n%8;
	    	res=rem+res;
	    	n/=8;
	    }
	    System.out.println(res);
	}
}
