package constructor;

public class Car {

	String brand;
	String color;
	double price;
	
	public Car(String brand, String color, double price) {
		this.brand=brand;
		this.color=color;
		this.price=price;
	}
	
	public Car(Car c) {
		this.brand=c.brand;
		this.color=c.color;
		this.price=c.price;
	}
}
