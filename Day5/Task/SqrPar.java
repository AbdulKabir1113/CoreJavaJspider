import java.util.Scanner;

class SqrPar {
    
    public static int perameterSq(int a){
        
        int per=4*a;
        return(per);
    }

    public static int areaSq(int a){
        
        int area=a*a;
        return(area);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(perameterSq(a));
        System.out.println(areaSq(a));
    }
}
