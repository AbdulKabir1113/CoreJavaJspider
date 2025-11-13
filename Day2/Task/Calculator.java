class Calculator{
    public static void add(){
    int a=2;
    int b=7;
    System.out.println("Addition is: "+ a+b);
    }

    public static void sub(){
    int a=2;
    int b=7;
    System.out.println("Substraction is: "+ (a-b));
    }

    public static void mul(){
    int a=2;
    int b=7;
    System.out.println("Multiplication is: "+ a*b);
    }

    public static void div(){
    int a=2;
    int b=7;
    System.out.println("Division is: "+ a/b);
    }

    public static void mod(){
    int a=2;
    int b=7;
    System.out.println("Modules is: "+ a%b);
    }

    public static void main(String[] args) {
        add();
        sub();
        mul();
        div();
        mod();
    }
}