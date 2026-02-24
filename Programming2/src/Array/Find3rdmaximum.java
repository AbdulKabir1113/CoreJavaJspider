package Array;

import java.util.Scanner;

public class Find3rdmaximum {

	public static void main(String[] args) {
		System.out.println("Enter the Array Size");
		Scanner sc= new Scanner(System.in);
		int size = sc.nextInt();
		int fmax=Integer.MIN_VALUE;
	    int smax=Integer.MIN_VALUE;
	    int tmax=Integer.MIN_VALUE;
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
				tmax=fmax;
				fmax=arr[i];
			}else if(arr[i]>smax && arr[i]<fmax) {
				tmax=smax;
				smax=arr[i];
			}
			else if(arr[i]<fmax && arr[i]<smax && arr[i]>tmax) {
				tmax=arr[i];
			}
		}
		System.out.println("2nd Maximum is :"+smax);
		System.out.println("3nd Maximum is :"+tmax);
		sc.close();
	}
}
