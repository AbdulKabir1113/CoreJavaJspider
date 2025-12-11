package numberprograms;
import java.util.Scanner;

public class PrimeInRange {

		public static void main(String[] args) 
		{
			Scanner sc=new Scanner (System.in);
			System.out.println("enter starting range");
			int n= sc.nextInt();
			System.out.println("enter ending range");
			int e= sc.nextInt();
			
			    	
			 for(int i=n;i<=e;i++)	{
				 
				 if(isPrime(i))
				     System.out.println(i);
			 }
			
		}
		 public static boolean isPrime(int n)
	   	{
			int count=0;
		
			 for(int i=1;i<=n;i++)
			 {
				 
				if(n%i==0) 
					count++;
	    }
					
	       if (count==2)
	    	   return true;
				
	       else
				return false;
			}

}
