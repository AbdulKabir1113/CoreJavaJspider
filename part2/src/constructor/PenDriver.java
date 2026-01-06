package constructor;
import java.util.Scanner;
public class PenDriver {

	public static void main(String[] args) {
		Pen p = new Pen("Meow","black",10);
		Pen p1 = new Pen("Flair","blue",20);
		Pen p2 = new Pen("cello","red",30);
		boolean check = true;
		String bill = "";
		double total = 0;
		
		
		while(check) {
			System.out.println("1"+p.brand);
			System.out.println("2"+p1.brand);
			System.out.println("3"+p2.brand);
			System.out.println("4 exits");
			
			Scanner sc = new Scanner(System.in);
			int ch = sc.nextInt();
			
			switch(ch) {
			case 1->{
				System.out.println(p.brand+p.color+p.price);
				System.out.println("1 buy or 2 no");
				
				int var= sc.nextInt();
				if(var==1) {
					System.out.println("buy");
				
				System.out.println(p.color+p.price);
				}
				else System.out.println("no");
			}
			case 2->{
				System.out.println(p1.brand+p1.color+p1.price);
				System.out.println("buy or no");
				
				int var= sc.nextInt();
				if(var==1) {
					System.out.println("buy");
				
				System.out.println(p.color+p.price);
				}
				else System.out.println("no");
			}
			case 3->{
				System.out.println(p2.brand+p2.color+p2.price);
				System.out.println("buy or no");
				
				int var= sc.nextInt();
				if(var==1) {
					System.out.println("buy");
				
				System.out.println(p.color+p.price);
				}
				else System.out.println("no");
			}
			
			case 4 ->{
				check = false;
			}
			}
		}
		
	}
}
