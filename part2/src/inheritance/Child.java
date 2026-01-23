package inheritance;

public class Child extends Parent {

	static {
		System.out.println("Child is Loaded");
	}
	static void respect() {
		System.out.println("Respect Parents");
	}
}
