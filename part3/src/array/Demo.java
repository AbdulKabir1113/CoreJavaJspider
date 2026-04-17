package array;

import java.util.Arrays;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array Size : ");
		int size = sc.nextInt();
		
	
		int [] a = new int[size];
		System.out.println(Arrays.toString(a));
		
		System.out.println("Enter the Array Elements");
		
		for(int i=0; i<a.length; i++) {
			a[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(a));
	}
}
