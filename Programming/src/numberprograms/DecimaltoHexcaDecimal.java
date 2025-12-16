package numberprograms;
import java.util.Scanner;
public class DecimaltoHexcaDecimal {

	public static void main(String[] args) {
		String res="";
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		while(n!=0) {
			int rem=n%16;
			if(rem<10) res=rem+res;
			else {
//			     if(rem==10) res="A"+res;
//			     else if(rem==11) res="B"+res;
//			     else if(rem==12) res="C"+res;
//			     else if(rem==13) res="D"+res;
//			     else if(rem==14) res="E"+res;
//			     else if(rem==15) res="F"+res;
				
				res=(char)(rem+55)+res;
			}
			n/=16;
			
		}
		System.out.println(res);
	}
	
}
