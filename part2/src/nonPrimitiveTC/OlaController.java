package nonPrimitiveTC;

import java.util.Scanner;

public class OlaController {

    public static Scanner sc = new Scanner(System.in);

    
    public static OlaUser doRegister() {

        OlaUser user = new OlaUser();

        System.out.print("Enter Username : ");
        user.setUsername(sc.next());

        System.out.print("Enter Password : ");
        user.setPassword(sc.next());

        System.out.println("Registration Successful...!");
        return user;
    }

 
    public static boolean doLogin(OlaUser user) {

        System.out.print("Enter Username : ");
        String username = sc.next();

        System.out.print("Enter Password : ");
        String password = sc.next();

        if (username.equals(user.getUsername()) &&
            password.equals(user.getPassword()))
            return true;
        else
            return false;
    }

  
    public static void bookingDetails(Cab cab) {

        System.out.println("******** Booking Details ********");
        System.out.println("********************************");

        if (cab instanceof Mini) {

            Mini m = (Mini) cab;

            System.out.println("Pickup Location : " + m.getPl());
            System.out.println("Drop Location   : " + m.getDl());
            System.out.println("Driver          : " + m.getDriver());
            System.out.println("Car Model       : " + m.getModel());
            System.out.println("Car No          : " + m.getCarNo());
            System.out.println("Phone Number    : " + m.getPh());
            System.out.println("Ratings         : " + m.getRatings());
            System.out.println("Fare : Rs. " + m.getFare() + " / KM");
            System.out.println("Enjoy Your Ride...!");
        }

        else if (cab instanceof Sedan) {

            Sedan m = (Sedan) cab;

            System.out.println("Pickup Location : " + m.getPl());
            System.out.println("Drop Location   : " + m.getDl());
            System.out.println("Driver          : " + m.getDriver());
            System.out.println("Car Model       : " + m.getModel());
            System.out.println("Car No          : " + m.getCarNo());
            System.out.println("Phone Number    : " + m.getPh());
            System.out.println("Ratings         : " + m.getRatings());
            System.out.println("Fare : Rs. " + m.getFare() + " / KM");
            System.out.println("Enjoy Your Ride...!");
        }

        else if (cab instanceof Luxury) {

            Luxury m = (Luxury) cab;

            System.out.println("Pickup Location : " + m.getPl());
            System.out.println("Drop Location   : " + m.getDl());
            System.out.println("Driver          : " + m.getDriver());
            System.out.println("Car Model       : " + m.getModel());
            System.out.println("Car No          : " + m.getCarNo());
            System.out.println("Phone Number    : " + m.getPh());
            System.out.println("Ratings         : " + m.getRatings());
            System.out.println("Fare : Rs. " + m.getFare() + " / KM");
            System.out.println("Enjoy Your Ride...!");
        }
    }
}

