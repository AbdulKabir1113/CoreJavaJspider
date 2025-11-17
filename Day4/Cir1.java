class Cir1 {
    
    public static double perameterCir(int r){
        
        double per=2*3.14*r;
        return(per);
    }

    public static double areaCir(int r){
        
        double area=3.14*r*r;
        return(area);
    }
    public static void main(String[] args) {
        System.out.println(perameterCir(7));
        System.out.println(areaCir(9));
    }
}

