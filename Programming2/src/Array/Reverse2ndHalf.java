package Array;

import java.util.Scanner;

public class Reverse2ndHalf {

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
		System.out.println("reverse array");	
		int strt=arr.length/2, end=arr.length-1;
		while(strt<end) {
			int temp=arr[strt];
			arr[strt]=arr[end];
			arr[end]=temp;
			
			strt++;
			end--;
		}
		
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		sc.close();
	}
}
