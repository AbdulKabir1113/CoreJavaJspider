package Array;

public class FindEvens {

	
	    public static void main(String[] args) {

	        int arr[] = {10, 15, 20, 25, 30, 33, 40};

	        int count = 0;
	        for(int i = 0; i < arr.length; i++) {
	            if(arr[i] % 2 == 0) {
	                count++;
	            }
	        }

	     
	        int evenArr[] = new int[count];

	        int j = 0;
	        for(int i = 0; i < arr.length; i++) {
	            if(arr[i] % 2 == 0) {
	                evenArr[j] = arr[i];
	                j++;
	            }
	        }

	       
	        System.out.println("Even elements:");
	        for(int i = 0; i < evenArr.length; i++) {
	            System.out.print(evenArr[i] + " ");
	        }
	    }
}
