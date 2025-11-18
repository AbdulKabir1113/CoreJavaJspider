import java.util.Scanner;

class CirNonPar {
    
    public static double perameterCir(){
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double per=2*3.14*r;
        return per;
    }

    public static double areaCir(){
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double area=3.14*r*r;
        return area;
    }
    public static void main(String[] args) {
        System.out.println(perameterCir());
        System.out.println(areaCir());
        
    }
}
