package Array;

import java.util.Scanner;

public class Find2ndMaximum {

	public static void main(String[] args) {
		System.out.println("Enter the Array Size");
		Scanner sc= new Scanner(System.in);
		int size = sc.nextInt();
		int fmax=Integer.MIN_VALUE;
	    int smax=Integer.MIN_VALUE;
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
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>fmax) {
				smax=fmax;
				fmax=arr[i];
			}else if(arr[i]>smax && arr[i]<fmax)
				smax=arr[i];
		}
		System.out.println("2nd Maximum is :"+smax);
		sc.close();
	}
}
