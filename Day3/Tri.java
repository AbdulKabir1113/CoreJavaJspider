class Tri {
    public static void perameterTri(int a, int b,int c){
        
        int per=a+b+c;
        System.out.println(per);
    }

    public static void areaTri(int b,int h){
        
        double area=0.5*b*h;
        System.out.println(area);
    }
    public static void main(String[] args) {
        perameterTri(9,8,7);
        areaTri(6,5);
    }
}
