package numberprograms;

public class PrimeAlternate {
	public static boolean isPrime(int n) {
		if(n<2) return false;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) return false;
		}
		return true;
	}

	public static void main(String[] args) {
		int c=0;
		for(int i=1; i<=100; i++) {
			if(isPrime(i)) {
				c++;
				if(c%2==1) System.out.println(i);
			}
		}
	}
}
