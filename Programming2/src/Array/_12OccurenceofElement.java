package Array;

public class _12OccurenceofElement {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,4,3,4,6,4};
		int ele=4;
		int count=0;
		for(int i=0; i<a.length;i++) {
			if(a[i]==ele) count++;
		}
		System.out.println(count);
	}
}
