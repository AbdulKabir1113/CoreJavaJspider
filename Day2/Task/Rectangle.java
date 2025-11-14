public class Rectangle {
    public static void perameterRec(){
        int l=5;
        int b=3;
        int per=2*(l+b);
        System.out.println(per);
    }

    public static void areaRec(){
        int l=5;
        int b=3;
        int area=l*b;
        System.out.println(area);
    }
    public static void main(String[] args) {
        perameterRec();
        areaRec();
    }
}
