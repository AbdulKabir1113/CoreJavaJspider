package Array;

import java.util.Arrays;

public class _19RightSideMax {

	public static void main(String[] args) {
		int a[] = {14,8,3,6,5,1};
		int b[] = new int[a.length-1];
		
		for(int i=0; i<a.length-1;i++) {
			int max = a[i+1];
			for(int j=i+1; j<a.length; j++) {
				if(a[j]>max) {
					max=a[j];
				}
			}
			b[i]=max;
		}
		System.out.println(Arrays.toString(b));
	}
}
