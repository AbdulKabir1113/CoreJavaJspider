class Rect1 {
    
    public static int perameterRec(int l,int b){
    
        int per=2*(l+b);
        return(per);
    }

    public static int areaRec(int l,int b){
        
        int area=l*b;
        return(area);
    }
    public static void main(String[] args) {
        System.out.println(perameterRec(6,9));
        System.out.println(areaRec(7,4));
    }
}

