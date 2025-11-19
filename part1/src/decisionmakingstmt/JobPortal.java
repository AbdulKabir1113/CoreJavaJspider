package decisionmakingstmt;
import java.util.Scanner;

public class JobPortal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Name: ");
        String name = sc.nextLine();

        System.out.println("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine(); 

        System.out.println("Enter Gender (M/F): ");
        char gender = sc.next().charAt(0);
        sc.nextLine(); 

        System.out.println("Enter Marital Status: ");
        String maritalStatus = sc.nextLine();

        boolean check = isEligible(age, maritalStatus, gender);

        if (check) {
            System.out.println(name + " you are Selected");
        } else {
            System.out.println("Better luck next life");
        }
    }

    public static boolean isEligible(int age, String maritalStatus, char gender) {

        if (gender == 'M' || gender == 'm') return true;
        if (age <= 30) return true;
        if (maritalStatus.equalsIgnoreCase("unmarried")) return true;
        return false;
    }
}
