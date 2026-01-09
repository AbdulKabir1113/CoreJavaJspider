package encapsulation;

public class RandomDigit {
	static int count;
	static long random() {
		
		int num = 7;
		long n = 4354678 * ++count;
		long random = 0;
		int c = 1;
		while(c<=7) {
			long rem = n % 10;
			if(c==1 && rem == 0);
			else {
				random = random * 10 + rem;
				c++;
			}
			n/=10;
		}
		return random;
	}
	public static void main(String[] args) {
		System.out.println(random());
		System.out.println(random());
	}
}
 