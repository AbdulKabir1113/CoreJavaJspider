package Array;

public class MaimumSubArray {

	public static void main(String[] args) {
		int a [] = {5,-7,4,3,8,-2,6,-9,3};
		int f=-1;
		int l=-1;
		int max=0;
		for(int i=0; i<a.length;i++) {
			int sum=0;
			for(int j=i; j<a.length;j++) {
				sum=sum+a[j];
				if(sum>max) {
					max=sum;
					f=i;
					l=j;
				}
			}
		}
		System.out.println("Max sum : "+max);
		
		for(int i=f; i<=l; i++) {
			System.out.print(a[i]+" ");
		}
	}
}
