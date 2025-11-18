import java.util.Scanner;

class TriNonPar {
    
    public static int perameterTri(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int per=a+b+c;
        return(per);
    }

    public static double areaTri(){
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int h = sc.nextInt();
        double area=0.5*b*h;
        return(area);
    }
    public static void main(String[] args) {
        System.out.println(perameterTri());
        System.out.println(areaTri());
    }
}
