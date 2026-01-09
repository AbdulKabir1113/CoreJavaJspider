package encapsulation;
import java.util.Scanner;
public class SBIBank {

	String userName;
	double balance;
	long accNo;
	String ifsc;
	int pin;
	long phoneNo;
	String email;
	String accType;
	
	public void openAccount(String userName,long phoneNo, String email) {
		this.userName=userName;
		this.phoneNo=phoneNo;
		this.email=email;
	}
	
	public double balance() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the pin");
		int pin = sc.nextInt();
		this.pin=pin;
		return balance;	
	}
}
