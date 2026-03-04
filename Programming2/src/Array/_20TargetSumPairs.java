package Array;

public class _20TargetSumPairs {

	public static void main(String[] args) {
		int a[] = {4,2,6,5,0,3,2,1,-1,2};
		int t = 5;
		
		for(int i=0; i<a.length-1;i++) {
			for(int j=i+1; j<a.length;j++) {
				if(a[i]+a[j]==t) {
					System.out.println(a[i]+","+a[j]);
				}
			}
		}
	}
}
