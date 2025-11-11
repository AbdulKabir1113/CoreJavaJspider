class Payment
{
    public static void main(String[] args) {
        double wallet = 10000;
        int movie = 500*2;
        int popcorn = 150;
        int colddrink = 100;
        int petrol = 500;
        int biryani = 500;
        double shopping = 3020.7;
        int cb1 = 700;
        int cb2 = 800;


        wallet -= movie;
        wallet -= popcorn;
        wallet -= colddrink;
        wallet -= petrol;
        wallet -= biryani;
        wallet -= shopping;
        wallet += cb1;
        wallet += cb2;

        System.out.println("Balance :"+ wallet +"/Rs");
    }
}