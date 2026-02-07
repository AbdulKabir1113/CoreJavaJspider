package PaymentProject;

import java.util.Scanner;

public class PaymentDriver {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PaymentApp app = null;

        System.out.println("Choose Payment App");
        System.out.println("1. PhPay\n2. GPay");
        int appChoice = sc.nextInt();

        switch (appChoice) {
            case 1 -> app = new PhPay("PhPay");
            case 2 -> app = new GPay("GPay");
            default -> {
                System.out.println("Invalid App Choice ❌");
                sc.close();
                return;
            }
        }

        System.out.println("\nChoose Payment Method");
        System.out.println("1. Credit Card\n2. Debit Card\n3. UPI");
        int paymentChoice = sc.nextInt();

        System.out.println("\nEnter Payment Amount");
        double amount = sc.nextDouble();

        switch (paymentChoice) {
            case 1 -> app.payment = new CreditCardPayment();
            case 2 -> app.payment = new DebitCardPayment();
            case 3 -> app.payment = new UpiPayment();
            default -> {
                System.out.println("Invalid Payment Choice ❌");
                sc.close();
                return;
            }
        }

        // Showing amount in Driver
        System.out.println("\nProcessing payment of ₹" + amount + " ...");

        app.payment.makePayment(amount);

        System.out.println("\nPayment Amount: ₹" + amount);
        System.out.println("Thanks for using " + app.appName + " 🙏");

        sc.close();
    }
}

