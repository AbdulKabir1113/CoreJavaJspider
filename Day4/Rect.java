class Rect {
   
    public static int perameterRec(){
        int l=5;
        int b=3;
        int per=2*(l+b);
        return(per);
    }

    public static int areaRec(){
        int l=5;
        int b=3;
        int area=l*b;
        return(area);
    }
    public static void main(String[] args) {
        System.out.println(perameterRec());
        System.out.println(areaRec());
    }
}
