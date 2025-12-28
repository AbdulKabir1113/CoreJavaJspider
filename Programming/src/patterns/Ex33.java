package patterns;

import java.util.Scanner;

public class Ex33 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int n = sc.nextInt();

        int c = 1; 

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 2*n - 1; j++) {
            	if(i+j>=n+1 && j-i<=n-1) {
            		while (true) {
                        if (!isPrime(c++)) {
                            System.out.print(c-1+" ");
                            break;
                        }
            	}
            }else System.out.print("  ");
            }
            System.out.println();
            
            
        }
        sc.close();
    }

    static boolean isPrime(int n) {
        if (n <= 1) return false;

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
