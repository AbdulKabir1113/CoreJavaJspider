package interfaces;

public class Driver {

	public static void main(String[] args) {
		Demo1 d = new Demo1();
		
		d.demo();
		d.demo1();
		d.disp();
		
//		static methods are not inherited in interface
//		d.demo2();  
//		d.demo3();
		
		System.out.println(d.a);
		System.out.println(d.a1);
		System.out.println(d.a2);
	}
}
