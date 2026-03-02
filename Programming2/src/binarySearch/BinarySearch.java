package binarySearch;

public class BinarySearch {

	public static void main(String[] args) {
		int a[] = {2,5,9,12,16};
		
		int f = 0;
		int l = a.length-1;
		
		int ele = 12;
		
			while(f<=l) {
				int m = (f+l)/2;
				if(ele == a[m]) {
					System.out.println(ele+" is found");
					break;
				}else if(ele>a[m]) {
					f = m+1;
				}else{
					l = m-1;
				}
		}
			if(l<f) System.out.println(ele + " not found");	
			
	}
}
