package overloading;

public class Whatsapp {

	public static void status(String msg,long no) {
		System.out.println(msg);
		System.out.println(no);
	}
	
    public static void status(long no,String msg) {
	
	    System.out.println(no);
	    System.out.println(msg);
	}
}
