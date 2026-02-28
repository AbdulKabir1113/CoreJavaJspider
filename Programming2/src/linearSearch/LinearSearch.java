package linearSearch;

public class LinearSearch {

	public static void main(String[] args) {
		
		// using boolean variable
//		int a[]= {12,7,45,98};
//		int ele = 7;
//		
//		boolean b = false;
//		
//		for(int i=0; i<a.length; i++) {
//			if(ele==a[i]) {
//				b=true;
//				break;
//			}
//		}
//		if(b) System.out.println(ele + " is found");
//		else System.out.println(ele + " not found");
		
		int a[]= {12,7,45,98};
		int ele = 7;
		
		int ind = -1;
		
		for(int i=0; i<a.length; i++) {
			if(ele==a[i]) {
				ind = i;
				break;
			}
		}
		if(ind == -1) System.out.println(ele + " is not found");
		else System.out.println(ele + " is found at index " + ind);
	}
}
