import java.util.Scanner;

class TriPar {

    public static int perameterTri(int a, int b,int c){
        
        int per=a+b+c;
        return(per);
    }

    public static double areaTri(int br,int h){
        
        double area=0.5*br*h;
        return(area);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(perameterTri(a,b,c));
        int br = sc.nextInt();
        int h = sc.nextInt();
        System.out.println(areaTri(br,h));
    }
}
