package Array;

public class _16EvenFirst {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		int b[]=new int[a.length];
		int even=0;
		for(int i:a) {
			if(i%2==0) {
				b[even++]=i;
			}
		}
		
		for(int i:a) {
			if(i%2==1) {
				b[even++]=i;
			}
		}
		
		for(int i:b) {
			System.out.print(i+" ");
		}
	}
}
