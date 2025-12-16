package numberprograms;

public class FirstNPrime {
	public static boolean isPrime(int n) {
		if(n<2) return false;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) return false;
		}
		return true;
	}

		public static void main(String[] args) {
			
			int n=10;
			int c=0;
			int i=2;
			while(c<n) {
				if(isPrime(i)) {
					c++;
					System.out.println(i);
				}
				i++;
			}
		}
}
