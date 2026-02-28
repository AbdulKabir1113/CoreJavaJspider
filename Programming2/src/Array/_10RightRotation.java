package Array;

public class _10RightRotation {

public static void main(String[] args) {
	int a[]= {1,2,3,4,5,6};
	int n=2;
	int b[]=new int[a.length];
	
	for(int i=0;i<a.length;i++) {
		if(n>=a.length) n=0;
		b[i]=a[n++];
	}
	for(int i=0;i<b.length;i++) {
		System.out.print(b[i]+" ");
	}
}
}
