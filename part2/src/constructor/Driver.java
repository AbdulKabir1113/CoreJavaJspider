package constructor;

public class Driver {

	public static void main(String[] args) {
		Book b = new Book();
		b.title = "Java";
		b.author = "James";
		b.price = 1000;
		System.out.println("Title : "+b.title);
		System.out.println("Author : "+b.author);
		System.out.println("price : "+b.price);
		System.out.println("========");
		Book b1 = new Book();
		b1.title = "Python";
		b1.author = "Guido";
		b1.price = 100;
		System.out.println("Title : "+b1.title);
		System.out.println("Author : "+b1.author);
		System.out.println("price : "+b1.price);
		System.out.println("========");
		Book b2 = new Book();
		b2.title = "JS";
		b2.author = "Bprice Each";
		b2.price = 110;
		System.out.println("Title : "+b2.title);
		System.out.println("Author : "+b2.author);
		System.out.println("price : "+b2.price);
		System.out.println("========");
		Book b3 = new Book();
		b3.title = "CSS";
		b3.author = "Hakwoon Wium lie";
		b3.price = 120;
		System.out.println("Title : "+b3.title);
		System.out.println("Author : "+b3.author);
		System.out.println("price : "+b3.price);
		System.out.println("========");
		Book b4 = new Book();
		b4.title = "SQL";
		b4.author = "Kabir";
		b4.price = 200;
		System.out.println("Title : "+b4.title);
		System.out.println("Author : "+b4.author);
		System.out.println("price : "+b4.price);
		
	}
	
}
