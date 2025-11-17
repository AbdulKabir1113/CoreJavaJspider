class Tri1 {
    
    public static int perameterTri(int a, int b,int c){
        
        int per=a+b+c;
        return(per);
    }

    public static double areaTri(int b,int h){
        
        double area=0.5*b*h;
        return(area);
    }
    public static void main(String[] args) {
        System.out.println(perameterTri(10, 3, 8));
        System.out.println(areaTri(5,8 ));
    }
}

