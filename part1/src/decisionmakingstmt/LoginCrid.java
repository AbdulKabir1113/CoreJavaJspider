package decisionmakingstmt;

import java.util.Scanner;

public class LoginCrid {

    static int dbId = 12345678;
    static String dbPwd = "Kabir123";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter id: ");
        int id = sc.nextInt();

        System.out.println("Enter Password: ");
        String pwd = sc.next();

        boolean check = logCrd(id, pwd);

        if (check) {
            System.out.println("Welcome");
        } 
    
    }

    public static boolean logCrd(int id, String pwd) {

        if (dbId == id && dbPwd.equals(pwd)) {
            return true;
        } 
        else if (dbId == id && !dbPwd.equals(pwd)) {
            System.out.println("Incorrect password");
            return false;
        } 
        else if (dbId != id && dbPwd.equals(pwd)) {
            System.out.println("Incorrect id");
            return false;
        } 
        else {
            System.out.println("Invalid credentials");
            return false;
        }
    }
}
