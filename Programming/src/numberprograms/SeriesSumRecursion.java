package numberprograms;
import java.util.Scanner;
public class SeriesSumRecursion {

	public static int seriesSum(int s, int e) {
		
//		if(s<=e) {
//			return s+seriesSum(s+1,e);
//		}
//		return 0;
		
		if(s<e) {
			return s+seriesSum(s+1,e);
		}
		return s;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the starting number: ");
		int s = sc.nextInt();
		System.out.println("Enter the ending number: ");
		int e = sc.nextInt();
		
		int res = seriesSum(s,e);
		System.out.println("Sum of "+s+" and "+e+" is:"+res);
		sc.close();
	}
}
