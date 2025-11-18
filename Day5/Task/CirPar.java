import java.util.Scanner;
class CirPar {
    public static double perameterCir(double r){
        
        double per=2*3.14*r;
        return(per);
    }

    public static double areaCir(double r){
        
        double area=3.14*r*r;
        return(area);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        System.out.println(perameterCir(r));
        System.out.println(areaCir(r));
    }
}

