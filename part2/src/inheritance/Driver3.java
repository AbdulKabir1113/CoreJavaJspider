package inheritance;

public class Driver3 {


	    public static void main(String[] args) {

	        MultiLevelC c = new MultiLevelC("Ramesh", "Rahul", "Aman");

	        System.out.println("GrandFathers Name :"+c.gName);
	        System.out.println("Fathers Name :"+c.fName);
	        System.out.println("Child Name :"+c.cName);
	    }
	
}
