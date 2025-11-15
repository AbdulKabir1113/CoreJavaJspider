class Cir {
    public static void perameterCir(int r){
        
        double per=2*3.14*r;
        System.out.println(per);
    }

    public static void areaCir(int r){
        
        double area=3.14*r*r;
        System.out.println(area);
    }
    public static void main(String[] args) {
        perameterCir(18);
        areaCir(11);
    }
}
