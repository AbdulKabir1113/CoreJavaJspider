package encapsulation;

public class RealUser {

	public static void main(String[] args) {
		Bank b = new Bank();
		System.out.println("Balance: Rs. "+b.getBalance());
	}
}
