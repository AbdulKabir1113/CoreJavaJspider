package Array;

import java.util.Arrays;

public class _27Updation {
	
	public static int search(int a[],int ele) {
		for(int i=0; i<a.length; i++) {
			if(ele == a[i]) {
				 return 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int a[] = {1,2,3,4};
		int newEle = 5;
		int oldEle = 1;
		int present = search(a,oldEle);
		if(a.length == 0) System.out.println("Array is Empty");
		else if (present == -1) System.out.println("Element not Present");
		else {
			for(int i=0; i<a.length; i++) {
				if(oldEle == a[i]) {
					  a[i] = newEle;
					  break;
				}
			}
			
			System.out.println(Arrays.toString(a));
		}
		
	}
}
