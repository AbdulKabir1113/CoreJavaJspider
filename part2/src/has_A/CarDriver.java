package has_A;

import java.util.Scanner;

public class CarDriver {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Car Brand : ");
		String brand = sc.next();
		System.out.println("Car Color : ");
		String color = sc.next();
		System.out.println("Car Price : ");
		double price = sc.nextDouble();

		System.out.println("Engine CC : ");
		double cc = sc.nextDouble();
		System.out.println("Engine HP : ");
		int hp = sc.nextInt();
		System.out.println("Engine Mieleage : ");
		double mieleage = sc.nextDouble();

		Car c = new Car(brand, color, price, new Engine(cc, hp, mieleage));
		System.out.println("1)Car Details \n2) Engine Details \n");
		int ch = sc.nextInt();

		switch (ch) {
		case 1 -> {
			System.out.println("Car Brand" + c.brand);
			System.out.println("Car Color" + c.color);
			System.out.println("Car Price" + c.price);
		}
		case 2 -> {
			System.out.println("Engine CC" + c.e.cc);
			System.out.println("Engine hp" + c.e.hp);
			System.out.println("Engine mieleage" + c.e.mieleage);

		}
		}

	}
}
