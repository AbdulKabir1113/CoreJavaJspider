package Array;

import java.util.Arrays;

public class _25Insertion {

	public static void main(String[] args) {
		int a[] = {1,2,3,5};
		int p = 8;
		int ele = 4;
		int size = a.length;
		
		
//		if(p<1 || p>size+1) {
//			System.out.println("Insertion Not Possible");
//		}else {
//			if(p>0 || p<size+1) {
//				int b[] = new int[a.length+1];
//				for(int i=0,j=0; i<b.length; i++) {
//					if(i==p-1) {
//						b[i] = ele;
//						
//					}else {
//						b[i] = a[j++];
//					}
//				}
//				System.out.println(Arrays.toString(b));	
//			}
//		}
		
		try {
			if(p>0 || p<size+1) {
				int b[] = new int[a.length+1];
				for(int i=0,j=0; i<b.length; i++) {
					if(i==p-1) {
						b[i] = ele;
						
					}else {
						b[i] = a[j++];
					}
				}
				System.out.println(Arrays.toString(b));	
			}
		}catch(Exception e) {
			System.out.println("Insertion Not Possible");
		}
		
	}
}
