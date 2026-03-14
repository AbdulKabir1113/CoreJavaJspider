package string;
import java.util.Scanner;
public class CountWord {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = "Java is easy";
		String count[] = str.split(" ");
		System.out.println(count.length);
		sc.close();
	}
}
