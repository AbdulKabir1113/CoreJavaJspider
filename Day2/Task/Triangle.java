public class Triangle {
    public static void perameterTri(){
        int a=3;
        int b=4;    
        int c=5;
        int per=a+b+c;
        System.out.println(per);
    }

    public static void areaTri(){
        int b=4;
        int h=3;
        double area=0.5*b*h;
        System.out.println(area);
    }
    public static void main(String[] args) {
        perameterTri();
        areaTri();
    }
}
