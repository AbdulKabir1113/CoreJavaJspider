package Array;

public class _21TargetAdjecentTargetPairs {

	public static void main(String[] args) {
		int a[] = {4,1,4,5,0,6,1,3,2,3};
		int t = 5;
		
		for(int i=0;i<a.length-1;i++) {
			if(a[i]+a[i+1] == t) {
				System.out.println(a[i]+","+a[i+1]);
			}
		}
	}
}
