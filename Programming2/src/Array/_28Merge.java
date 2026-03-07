package Array;

import java.util.Arrays;

public class _28Merge {

	public static void main(String[] args) {
		int a[] = {1,2,3,4};
		int b[] = {5,6,7,8,9};
		int c[] = new int[a.length+b.length];
		int j=0;
		
		for(int i=0; i<a.length; i++) {
			c[j++] = a[i];
		}
		
		for(int i:b) {
			c[j++]=i;
		}
		
		System.out.println(Arrays.toString(c));
	}
}
