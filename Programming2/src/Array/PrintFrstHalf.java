package Array;

import java.util.Scanner;

public class PrintFrstHalf {

	public static void main(String[] args) {
		System.out.println("Enter the Array Size");
		Scanner sc= new Scanner(System.in);
		int size = sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the Elements of Array: ");
		for(int i = 0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Elements of the array are: ");
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("Frst half of the array");
		for(int i = 0; i<arr.length/2; i++) {
			
				System.out.println(arr[i]);
			
		}
		sc.close();
	}
}
