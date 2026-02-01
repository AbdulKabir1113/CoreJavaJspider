package nonPrimitiveTC;

import java.util.Scanner;

public class Ola {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean ola = true;
        OlaUser user = null;

        String pl = "";
        String dl = "";

        while (ola) {
            System.out.println("1. Register\n2. Login\n3. Exit");
            int ch = sc.nextInt();

            switch (ch) {

                case 1 -> {
                    user = OlaController.doRegister();
                }

                case 2 -> {
                    if (user != null) {

                        if (OlaController.doLogin(user)) {

                            boolean check = true;

                            while (check) {
                                System.out.println(
                                    "1. Mini\n2. Sedan\n3. Luxury\n4. Logout"
                                );
                                ch = sc.nextInt();

                                Cab cab = null;

                                if (ch != 4) {
                                    System.out.print("Pickup Location : ");
                                    pl = sc.next();

                                    System.out.print("Drop Location : ");
                                    dl = sc.next();
                                }

                                switch (ch) {

                                    case 1 -> {
                                        cab = new Mini(
                                            pl, dl,
                                            "Karthik",
                                            "TG09AA007",
                                            "Nano",
                                            9876543210L,
                                            5,
                                            10
                                        );
                                        OlaController.bookingDetails(cab);
                                    }

                                    case 2 -> {
                                        cab = new Sedan(
                                            pl, dl,
                                            "Suresh",
                                            "AP10TY2992",
                                            "Punch",
                                            7654328976L,
                                            4.6,
                                            15
                                        );
                                        OlaController.bookingDetails(cab);
                                    }

                                    case 3 -> {
                                        cab = new Luxury(
                                            pl, dl,
                                            "Ravi",
                                            "AP07AZ0001",
                                            "RangeRover",
                                            6543234561L,
                                            4.9,
                                            25
                                        );
                                        OlaController.bookingDetails(cab);
                                    }

                                    case 4 -> {
                                        check = false;
                                        System.out.println("Logout Successful...");
                                    }
                                }
                            }

                        } else {
                            System.out.println("Invalid Credentials...");
                        }

                    } else {
                        System.out.println("No user found... Please register first.");
                    }
                }

                case 3 -> {
                    ola = false;
                    System.out.println("Thank You...");
                }
            }
        }
    }
}
