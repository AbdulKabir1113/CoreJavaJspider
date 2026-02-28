package Array;

public class _17PrimeFirsts {
	
	public static boolean isPrime(int n) {
		for(int i=2; i<n; i++) {
			if(n%i==0) 
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		int b[]=new int[a.length];
		int j=0;
		
		
		for(int i=0; i<a.length;i++) {
			if(!isPrime(i)) {
				b[j++]=a[i];
			}
		}
		
		
		for(int i=0; i<a.length;i++) {
			if(isPrime(i)) {
				b[j++]=a[i];
			}
		}
		

		for(int i:b) {
			System.out.print(i+" ");
		}
		
	}
}
