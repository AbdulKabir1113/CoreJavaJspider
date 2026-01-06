package constructor;

public class DriverCar {

	public static void main(String[] args) {
		
		Car c = new Car("Audi","White",1000000);
		Car c1 = new Car(c);
		
		System.out.println("Brand :"+ c.brand);
		System.out.println("Color :"+ c.color);
		System.out.println("Price :"+ c.price);
		System.out.println("______________________");
		System.out.println("Brand :"+ c1.brand);
		System.out.println("Color :"+ c1.color);
		System.out.println("Price :"+ c1.price);
	}
}
