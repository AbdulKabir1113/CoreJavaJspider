package Array;

public class _14ZerosFirsts {

	
	    public static void main(String[] args) {

	        int arr[] = {0,3,0,20,3,0,0,3,1,4};

	        int newArr[] = new int[arr.length];

//	        int zeroIndex = 0;
//	        int nonZeroIndex = 0;
//
//	        // First store zeros
//	        for(int i=0;i<arr.length;i++) {
//	            if(arr[i] == 0) {
//	                newArr[zeroIndex] = 0;
//	                zeroIndex++;
//	                nonZeroIndex++;
//	            }
//	        }
//
//	        // Then store non-zeros
//	        for(int i=0;i<arr.length;i++) {
//	            if(arr[i] != 0) {
//	                newArr[nonZeroIndex] = arr[i];
//	                nonZeroIndex++;
//	            }
//	        }
//
//	        // Print new array
//	        for(int i=0;i<newArr.length;i++) {
//	            System.out.print(newArr[i] + " ");
//	        }
	        
	        for(int i=arr.length-1,j=newArr.length-1; i>=0; i--) {
	        	if(arr[i]!=0) {
	        		newArr[j--]=arr[i];
	        	}
	        }
	        
	        for(int i=0;i<newArr.length;i++) {
	            System.out.print(newArr[i] + " ");
	        }
	    }
}
