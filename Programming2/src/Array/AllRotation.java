package Array;

public class AllRotation {

	
	    public static void main(String[] args) {

	        int arr[] = {1,2,3,4};
	        int n = arr.length;

	        for(int i = 0; i < n; i++) {

	            // Print rotated array
	            for(int j = 0; j < n; j++) {
	                System.out.print(arr[(i + j + 1) % n] + " ");
	            }

	            System.out.println();
	        }
	    }
}
