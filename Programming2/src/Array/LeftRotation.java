package Array;

public class LeftRotation {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		int n=2;
		int m=a.length-n;
		int b[]=new int[a.length];
		
		for(int i=0;i<a.length;i++) {
			
			if(m==a.length) m=0;
			b[i]=a[m++];
		}
		
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i]+" ");
		}
	}
}
