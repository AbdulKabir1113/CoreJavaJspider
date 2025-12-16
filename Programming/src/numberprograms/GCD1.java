package numberprograms;

public class GCD1 {

	public static void main(String[] args) {
		int a=12;
		int b=18;
		
		int min=(a<b)?a:b;
		
		for(int i=min; i>=1; i--) {
			if(a%i==0 && b%i==0) {
				System.out.println(i);
				break;
			}
		}
	}
}
