package Array;

public class _23LongestIncresingSubSequence {

	public static void main(String[] args) {
		
		int a[] = {2,3,7,3,5,9,15,23,24,3,2,7};
		int cc = 1;
		int mc = 0;
		int l = -1;
		int f = -1;
		int ns = 0;
		
		
		for(int i=0; i<a.length-1; i++) {
			
			
			if(a[i]<a[i+1]) {
				cc++;
			}else {
				cc = 1;
				ns = i+1;
			}if(cc>mc) {
				mc = cc;
				f = ns;
				l = i+1;
			}
		}
		for(int i=f; i<=l; i++) {
			System.out.print(a[i]+" ");
		}
	}
}
