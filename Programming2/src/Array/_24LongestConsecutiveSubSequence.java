package Array;

public class _24LongestConsecutiveSubSequence {

public static void main(String[] args) {
		
		int a[] = {2,3,4,13,14,15,16,17,18,3,4,7};
		int cc = 1;
		int mc = 0;
		int l = -1;
		int f = -1;
		int ns = 0;
		
		
		for(int i=0; i<a.length-1; i++) {
			
			if(a[i]+1==a[i+1]) {
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
