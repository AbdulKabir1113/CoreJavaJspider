package linearSearch;

public class Search2SameElements {

	public static void main(String[] args) {
		int a[]= {12,7,45,98,7};
		int ele = 7;
		
		int find = -1;
		int lind = -1;
		
		for(int i=0; i<a.length; i++) {
			if(ele==a[i]) {
				if(find == -1 ) {
					find = i;
				}
				lind = i;
			}
		}
		if(find == -1 && lind == -1) System.out.println(ele + " is not found");
		else System.out.println(ele + " is found at " +find+","+lind);
	}
}
