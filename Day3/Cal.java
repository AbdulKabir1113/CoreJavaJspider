class Cal {
    public static void add(int a,int b){
    
    System.out.println("Addition is: "+ a+b);
    }

    public static void sub(int a,int b){
    
    System.out.println("Substraction is: "+ (a-b));
    }

    public static void mul(int a,int b){
    
    System.out.println("Multiplication is: "+ a*b);
    }

    public static void div(double a, double b){
    
    System.out.println("Division is: "+ a/b);
    }

    public static void mod(int a,int b){
    
    System.out.println("Modules is: "+ a%b);
    }

    public static void main(String[] args) {
        add(7,11);
        sub(7,11);
        mul(7,11);
        div(7,11);
        mod(7,11);
    }
}
