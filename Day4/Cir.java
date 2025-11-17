class Cir {
    
    public static double perameterCir(){
        int r=5;
        double per=2*3.14*r;
        return per;
    }

    public static double areaCir(){
        int r=5;
        double area=3.14*r*r;
        return area;
    }
    public static void main(String[] args) {
        System.out.println(perameterCir());
        System.out.println(areaCir());
        
    }
}
