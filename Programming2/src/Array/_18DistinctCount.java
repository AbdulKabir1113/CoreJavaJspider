package Array;

public class _18DistinctCount {

	public static void main(String[] args) {
		
		int a[]= {3,9,3,3,7,9,6,1,6};
	    int visit[]= new int[a.length];
	    
	    
	    
	    for(int i=0; i<a.length; i++) {
	    	int c=1;
	    	if(visit[i]!=1) {
	    		for(int j=i+1; j<a.length; j++) {
	    			if(a[i]==a[j]) {
	    				c++;
	    				visit[j]=1;
	    			}
	    		}
	    		//unique -> if(c==1)
	    		//duplicate -> if(c>1)
	    		// distinct
	    		System.out.println(a[i]+"->"+c);
	    	}
	    	
	    }
	}
}
