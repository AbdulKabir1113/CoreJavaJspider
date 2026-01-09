package encapsulation;
import java.util.Scanner;
public class Bank {

	private double balance = 10000;
	int pin = 123;
	
	public String getBalance() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a pin");
		int pin = sc.nextInt();
		if(this.pin==pin) {
			return "Balance : "+balance;
		}else {
			return "get lost";
		}
	}
}
