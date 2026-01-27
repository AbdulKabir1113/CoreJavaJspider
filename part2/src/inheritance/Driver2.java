package inheritance;

public class Driver2 {

	public static void main(String[] args) {
		SingleLevelChild c = new SingleLevelChild("Rahul","Aman");
		
		System.out.println("Fathers Name :"+c.name);
		System.out.println("Child Name :"+c.name1);
	}
}
