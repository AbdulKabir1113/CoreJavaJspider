package Array;

public class ReverseArray1 {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		
		//strore in another array
//		int b[] = new int[a.length];
//		
//		for(int i=0,j=a.length-1; i<a.length; i++,j--) {
//			b[i]=a[j];
//		}
//		for(int i=0; i<b.length;i++) {
//			System.out.print(b[i]+" ");
//		}
		
		for(int i=0,j=a.length-1; i<a.length/2; i++,j--) {
			int temp = a[i];
			a[i]=a[j];
			a[j]=temp;
			
		}
		for(int i=0; i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}
		
}
