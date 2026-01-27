package inheritance;

public class Driver4 {

	public static void main(String[] args) {
		HInheritanceC1 c = new HInheritanceC1("Abdul Quddus","Kabir");
		HInheritanceC2 c1 = new HInheritanceC2("Abdul Quddus","Maaz");
		
		System.out.println(c.fName);
		System.out.println(c.c1Name);
		
		System.out.println(c1.fName);
		System.out.println(c1.c2Name);
	}
}
