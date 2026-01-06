package constructor;

public class DriverNonPara {

	public static void main(String[] args) {
		BookNonPara b = new BookNonPara("java","James",1000);
		BookNonPara b1 = new BookNonPara("pyhton","Guido",100);
		BookNonPara b2 = new BookNonPara("html","Tim",120);
		BookNonPara b3 = new BookNonPara("CSS","Wium Lee",130);
		BookNonPara b4 = new BookNonPara("JS","bredun",140);
		
		
		System.out.println("Book1 Details");
		System.out.println("Title : " + b.title);
		System.out.println("Author : "+b.author);
		System.out.println("price : "+b.price);
		System.out.println("========");
		System.out.println("Book2 Details");
		System.out.println("Title : " + b1.title);
		System.out.println("Author : "+b1.author);
		System.out.println("price : "+b1.price);
		System.out.println("========");
		System.out.println("Book3 Details");
		System.out.println("Title : " + b2.title);
		System.out.println("Author : "+b2.author);
		System.out.println("price : "+b2.price);
		System.out.println("========");
		System.out.println("Book4 Details");
		System.out.println("Title : " + b3.title);
		System.out.println("Author : "+b3.author);
		System.out.println("price : "+b3.price);
		System.out.println("========");
		System.out.println("Book5 Details");
		System.out.println("Title : " + b4.title);
		System.out.println("Author : "+b4.author);
		System.out.println("price : "+b4.price);
		
	}
}
