package encapsulation;

public class DogDriver {

	public static void dogDetails(Dog d) {
		System.out.println("Breed : "+d.breed);
		System.out.println("Age : "+d.age);
	}
	
	public static void main(String[] args) {
		Dog d = new Dog("breed1",10);
		Dog d1 = new Dog("breed2",1);
		Dog d2 = new Dog("breed3",3);
		Dog d3 = new Dog("breed4",5);
		Dog d4 = new Dog("breed5",14);
		
		dogDetails(d);
		dogDetails(d1);
		dogDetails(d2);
		dogDetails(d3);
		dogDetails(d4);
	}
}
