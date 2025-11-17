class Tri {
    
    public static int perameterTri(){
        int a=3;
        int b=4;    
        int c=5;
        int per=a+b+c;
        return(per);
    }

    public static double areaTri(){
        int b=4;
        int h=3;
        double area=0.5*b*h;
        return(area);
    }
    public static void main(String[] args) {
        System.out.println(perameterTri());
        System.out.println(areaTri());
    }
}
