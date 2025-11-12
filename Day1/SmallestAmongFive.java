public class SmallestAmongFive {
    public static void main(String[] args) {
        int a=10;
        int b=2;
        int c=30;
        int d=40;
        int e=8;

        // int res = a<b ? ((a<c?a:c)) : ((b<c?b:c));
        int res1 = a<b && a<c && a<d && a<e ? a
                :  b<c && b<d && b<e? b
                    : c<d&&c<e ? c 
                        : d<e ? d  
                            :e;
        // System.out.println(res);
        System.out.println(res1);
    }
}
