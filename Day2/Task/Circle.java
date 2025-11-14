public class Circle {
    public static void perameterCir(){
        int r=5;
        double per=2*3.14*r;
        System.out.println(per);
    }

    public static void areaCir(){
        int r=5;
        double area=3.14*r*r;
        System.out.println(area);
    }
    public static void main(String[] args) {
        perameterCir();
        areaCir();
    }
}
