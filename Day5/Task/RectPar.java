import java.util.Scanner;

public class RectPar {
    
    public static int perameterRec(int l,int b){
    
        int per=2*(l+b);
        return(per);
    }

    public static int areaRec(int l,int b){
        
        int area=l*b;
        return(area);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(perameterRec(l,b));
        System.out.println(areaRec(l,b));
    }
}

