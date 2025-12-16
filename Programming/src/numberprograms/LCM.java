package numberprograms;

public class LCM {

	public static void main(String[] args) {
		int a=12;
		int b=18;
		
		int max=(a>b)?a:b;
		int lcm=max, k=2;
		
		while(true) {
			if(lcm%a==0 && lcm%b==0) {
				System.out.println(lcm);
				break;
			}
			lcm=max*k++;
		}
	}
}
