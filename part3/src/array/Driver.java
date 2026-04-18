package array;

import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Controller c = Controller.getController();

        while (true) {
            System.out.println("\n1.Admin\n2.User\n3.Exit");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    c.adminMenu();
                    break;

                case 2:
                    c.userMenu();
                    break;

                case 3:
                    System.out.println("Thank You!");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}