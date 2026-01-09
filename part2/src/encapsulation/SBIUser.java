package encapsulation;

import java.util.Scanner;

public class SBIUser {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1) Login");
            System.out.println("2) Exit");
            System.out.print("Enter choice: ");
            int start = sc.nextInt();

            if (start == 2) {
                System.out.println("Thank you for visiting SBI 😊");
                break;
            }

            if (start == 1) {

                System.out.println("""
                        1. Open Account
                        2. Passbook
                        3. Money Transfer
                        4. Check Balance
                        5. Create Pin
                        6. Change Pin
                        7. Logout
                        """);

                System.out.print("Enter option: ");
                int choice = sc.nextInt();
                sc.nextLine(); // clear buffer

                switch (choice) {

                    case 1 -> {
                    	SBIBank b = new SBIBank();
                        System.out.print("Enter Your Name: ");
                        String name = sc.nextLine();
                        b.userName=name;
                        System.out.print("Enter Your Phone No: ");
                        long phoneNo = sc.nextLong();
                        sc.nextLine();
                        b.phoneNo=phoneNo;
                        System.out.print("Enter Your Email: ");
                        String email = sc.nextLine();
                        b.email=email;
                        System.out.println("Account Created Successfully ✅");
                        
                    }

                    case 7 -> {
                        System.out.println("Logged out successfully 🔒");
                        break;
                    }
                    
                    case 4 -> {
                    	SBIBank b = new SBIBank();
                        System.out.println(b.balance());
                    }

                    default -> System.out.println("Invalid option ❌");
                }
            }
        }

        sc.close();
    }
}

