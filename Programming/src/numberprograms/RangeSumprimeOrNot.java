package numberprograms;
import java.util.Scanner;

public class RangeSumprimeOrNot {

		public static void main(String[] args) 
		{
			Scanner sc=new Scanner (System.in);
			System.out.println("enter starting range");
			int n= sc.nextInt();
			System.out.println("enter ending range");
			int e= sc.nextInt();
			
			   int sum =0; 	
			 for(int i=n;i<=e;i++)	{
				 if(isPrime(i))
					 sum=sum+i;
				     
			 }
			 System.out.println(sum+"  is sum");
			 if(sum<=1) {
				 System.out.println(sum+"  nither prime nor composite"); 
			 }
			 
			 else if(isPrime(sum)) {
		    	
				 System.out.println(sum+"  sum is prime");
		    }
		    else
				 System.out.println(sum+"  sum is composite");
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
