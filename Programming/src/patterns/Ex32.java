package patterns;
import java.util.Scanner;
public class Ex32
{
	  public static void main(String[] args) {
		  Scanner sc=new Scanner (System.in);
			System.out.println("enter a number");
			int n= sc.nextInt();
			char c1='A';
			char c='a';
			for(int i=1;i<=n;i++) {
				  for(int j=1;j<=n*2-1;j++) {
					  if(i+j>=n+1 && j-i<=n-1) {
						  if(i%2==0) {
							  System.out.print(c++ +" ");  
						  }
						  else {
							  System.out.print(c1++ +" ");
						  }
					  }
					  else System.out.print("  ");
				  }
				  System.out.println();
				
			  }	
		}
	}
