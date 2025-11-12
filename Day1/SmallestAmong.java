class SmallestAmong {
    public static void main(String[] args) {
        int a=10;
        int b=2;
        int c=30;

        int res = a<b ? ((a<c?a:c)) : ((b<c?b:c));
        int res1 = a<b&&a<c ? a: b<c? b:c;
        System.out.println(res);
        System.out.println(res1);
    }
}
