package Array;

import java.util.Arrays;

public class _26Deletion {

	    public static void main(String[] args) {

	        int a[] = {2,4,6,4,8,4};
	        int key = 4;

	        // 1️ Check array empty
	        if(a.length == 0){
	            System.out.println("Array is empty");
	            return;
	        }

	        int count = 0;
	        int index = -1;

	        // 2️ Find element and count duplicates
	        for(int i=0;i<a.length;i++){

	            if(a[i] == key){

	                count++;

	                if(index == -1){
	                    index = i;   // first match
	                }
	            }
	        }

	        // 3️⃣ Element not found
	        if(count == 0){
	            System.out.println("Element not found");
	            return;
	        }

	        // 4️ Delete first match
	        for(int i=index;i<a.length-1;i++){
	            a[i] = a[i+1];
	        }

	        System.out.println("After deleting first occurrence:");

	        for(int i=0;i<a.length-1;i++){
	            System.out.print(a[i]+" ");
	        }

	        System.out.println();

	        // 5️ Delete all duplicate elements
	        int b[] = new int[a.length-count];
	        int j=0;

	        for(int i=0;i<a.length;i++){

	            if(a[i] != key){
	                b[j++] = a[i];
	            }
	        }

	        System.out.println("After deleting all occurrences:");

	        for(int i=0;i<b.length;i++){
	            System.out.print(b[i]+" ");
	        }
	    }
}
