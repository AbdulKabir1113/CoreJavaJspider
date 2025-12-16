package numberprograms;
import java.util.Scanner;
public class AssendingOrder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int res=0;
		for(int i=1; i<=9; i++) {
			int temp=n;
			
				while(temp>0) {
					int rem = temp%10;
					if(rem==i) {
						res=res*10+rem;
					}
					temp/=10;
				}
			}
			System.out.println(res);
		}
}
