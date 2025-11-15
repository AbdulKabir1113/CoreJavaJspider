class Rect {
    public static void perameterRec(int l,int b){
    
        int per=2*(l+b);
        System.out.println(per);
    }

    public static void areaRec(int l,int b){
        
        int area=l*b;
        System.out.println(area);
    }
    public static void main(String[] args) {
        perameterRec(6,9);
        areaRec(7,4);
    }
}
