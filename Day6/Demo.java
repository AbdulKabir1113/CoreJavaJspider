class Demo {
    public static int add(int a){
        System.out.println(a);
        a++;
        System.out.println(a);
        return a;
    }
    public static void main(String[] args) {
        int a=5;
        System.out.println(a);
        int res= add(a);
        System.out.println(res);
        System.out.println(a);
    }
}
