import java.util.Scanner;

class CalNonPar{

    public static int add(){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    return a+b;
    }

    public static int sub(){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    return (a-b);
    }

    public static int mul(){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    return a*b;
    }

    public static int div(){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    return a/b;
    }

    public static int mod(){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    return a%b;
    }

    public static void main(String[] args) {
        System.out.println("Enter Two Numbers for Addition: ");
        System.out.println(add()); 
        System.out.println("Enter Two Numbers for Substraction: ");
        System.out.println(sub());
        System.out.println("Enter Two Numbers for Multiplication: ");
        System.out.println(mul()); 
        System.out.println("Enter Two Numbers for Division: ");
        System.out.println(div()); 
        System.out.println("Enter Two Numbers Mod: ");
        System.out.println(mod());
    }
}


