package numberprograms;
import java.util.*;

public class Ex1 {

    public static int fSmallestDigit(int n) {
        int rem = 0;
        int sn = n;
        while(n > 0) {
            rem = n % 10;
            if(sn > rem) {
                sn = rem;
            }
            n /= 10;    
        }
        return sn;
    }

    public static int fLargestDigit(int n) {
        int rem = 0;
        int sn = 0;
        while(n > 0) {
            rem = n % 10;
            if(sn < rem) {
                sn = rem;
            }
            n /= 10;    
        }
        return sn;
    }

    public static boolean checkPrime(int n) {
        for(int i = 2; i <= n/2; i++) {
            if(n % i == 0) 
                return false;
        }
        return true;
    }

    public static void fact(int n) {
        int fact = 1;
        for(int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println("Smallest digit is prime soo Factorial of largest digit " + n + " is : " + fact);
    }

    public static boolean isSpy(int n) {
        int rem = 0;
        int sum = 0;
        int prod = 1;
       
        while(n > 0) {
            rem = n % 10;
            sum += rem;
            prod *= rem;
            n /= 10;
        }
        return prod == sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();

        int small = fSmallestDigit(n);
        System.out.println("Smallest digit: "+small);

        int large = fLargestDigit(n);
        System.out.println("Largest digit: "+large);
        
        int spy=large+small;
        System.out.println("Sum of smallest and largest :"+ spy);																																																																																																																																																																																																																																																																													

        
        if(checkPrime(small)) {
            fact(large);
        } else {
            if(isSpy(spy))
                System.out.println(spy+" is Spy Number");
            else
                System.out.println(spy+" is Not Spy Number");
        }
    }
}
