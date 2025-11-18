import java.util.Scanner;

class RectNonPar {

    public static int perameterRec(){
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int b = sc.nextInt();
        int per=2*(l+b);
        return(per);
    }

    public static int areaRec(){
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int b = sc.nextInt();
        int area=l*b;
        return(area);
    }
    public static void main(String[] args) {
        
        System.out.println(perameterRec());
        System.out.println(areaRec());
    }
}
