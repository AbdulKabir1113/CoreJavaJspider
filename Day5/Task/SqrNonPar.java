import java.util.Scanner;

public class SqrNonPar {
    
    public static int perameterSq(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int per=4*a;
        return(per);
    }

    public static int areaSq(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int area=a*a;
        return(area);
    }
    public static void main(String[] args) {
        System.out.println(perameterSq());
        System.out.println(areaSq());
    }
}
