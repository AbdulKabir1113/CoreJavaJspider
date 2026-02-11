package interfaces;

public interface Demo {
    
	
	// abstract method
	public abstract void demo();
	void demo1();
	
	// static method
	public static void demo2() {
		System.out.println("static method");
	}
	static void demo3() {
		System.out.println("static method");
	}
	
	// static final variable
	int a = 10;
	final static int a1 = 19;
	static final int a2 = 100;
	
	
	// default method 
	default void disp() {
		System.out.println("default method");
	}
	
	// private method
	private static void test() {
		System.out.println("private static method");
	}
	
	
	// not allowed
	
	// private,default,protected abstract method not allowed
//	private abstract void demo();
//	protected abstract void test1();
	
	
	// Initializer not allowed
//	int a;  
	
	// constructor not allowed
//	public Demo() {    
//		
//	}

}
