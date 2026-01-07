package constructor;
import java.util.Scanner;
public class PenDriver {

	public static void main(String[] args) {
		Pen p1 = new Pen("Meow","black",10);
		Pen p2 = new Pen("Flair","blue",20);
		Pen p3 = new Pen("Cello","red",30);
		boolean check = true;
		String bill = "";
		double total = 0;
		
		
		while(check) {
			System.out.println("******** Welcome to Pen Shop *******");
			System.out.println("1."+p1.brand);
			System.out.println("2."+p2.brand);
			System.out.println("3."+p3.brand);
			System.out.println("4. Exit");
			
			Scanner sc = new Scanner(System.in);
			int ch = sc.nextInt();
			
			switch(ch) {
			case 1->{
				System.out.println("Brand: "+p1.brand);
				System.out.println("Color: "+p1.color);
				System.out.println("Price: "+p1.price);
				System.out.println("Do you wanna buy ? (y/n)");
				char c = sc.next().toLowerCase().charAt(0);
				
				if(c=='y') {
					System.out.println("Quantity : ");
					int qty = sc.nextInt();
					total += qty * p1.price;
					bill += p1.brand + " Rs." + p1.price + " Qty : " + qty + " * " + p1.price + 
							" = " + (p1.price * qty) + "\n";
					System.out.println(p1.brand + " is added to cart...!");
				  }
				}
				
			case 2->{
				System.out.println("Brand: "+p2.brand);
				System.out.println("Color: "+p2.color);
				System.out.println("Price: "+p2.price);
				System.out.println("Do you wanna buy ? (y/n)");
				char c = sc.next().toLowerCase().charAt(0);
				
				if(c=='y') {
					System.out.println("Quantity : ");
					int qty = sc.nextInt();
					total += qty * p2.price;
					bill += p2.brand + " Rs." + p2.price + " Qty : " + qty + " * " + p2.price + 
							" = " + (p2.price * qty) + "\n";
					System.out.println(p2.brand + " is added to cart...!");
				  }
			}
			case 3->{
				System.out.println("Brand: "+p3.brand);
				System.out.println("Color: "+p3.color);
				System.out.println("Price: "+p3.price);
				System.out.println("Do you wanna buy ? (y/n)");
				char c = sc.next().toLowerCase().charAt(0);
				
				if(c=='y') {
					System.out.println("Quantity : ");
					int qty = sc.nextInt();
					total += qty * p3.price;
					bill += p3.brand + " Rs." + p3.price + " Qty : " + qty + " * " + p3.price + 
							" = " + (p3.price * qty) + "\n";
					System.out.println(p3.brand + " is added to cart...!");
				  }
			}
			
			case 4 ->{
				if(total>0) {
					System.out.println("************ BILL ***********");
					System.out.println("*******************************");
					System.out.println(bill);
					System.out.println("Total Amount : Rs. " + total);
				}
				System.out.println("\n Thnak You...🙏🙏🙏");
				check=false;
			}
			}
		}
		
	}
}
