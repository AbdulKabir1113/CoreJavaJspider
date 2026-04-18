package array;

import java.util.Scanner;

public class Controller {

    private Amazon amazon;

    public static Controller getController() {
        return new Controller();
    }

    private Controller() {
        amazon = new Amazon();
    }

    Scanner sc = new Scanner(System.in);

    // ADMIN MENU
    public void adminMenu() {
        System.out.println("1.Add Product\n2.View Products");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                addProduct();
                break;

            case 2:
                viewProducts();
                break;

            default:
                System.out.println("Invalid Choice");
        }
    }

    // USER MENU
    public void userMenu() {
        System.out.println("1.View Products\n2.Add to Cart\n3.View Cart");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                viewProducts();
                break;

            case 2:
                addToCart();
                break;

            case 3:
                viewCart();
                break;

            default:
                System.out.println("Invalid Choice");
        }
    }

    public void addProduct() {
        if (amazon.pIndex < amazon.products.length) {

            System.out.print("Enter Product Id: ");
            int id = sc.nextInt();

            System.out.print("Enter Product Name: ");
            String name = sc.next();

            System.out.print("Enter Brand: ");
            String brand = sc.next();

            System.out.print("Enter Price: ");
            double price = sc.nextDouble();

            amazon.products[amazon.pIndex++] =
                    new Product(id, name, brand, price);

            System.out.println("✅ Product Added");

        } else {
            System.out.println("❌ Product list full");
        }
    }

    public void viewProducts() {
        if (amazon.pIndex == 0) {
            System.out.println("❌ No Products Available");
            return;
        }

        for (int i = 0; i < amazon.pIndex; i++) {
            amazon.products[i].display();
        }
    }

    public void addToCart() {
        System.out.print("Enter Product Id to add: ");
        int id = sc.nextInt();

        for (int i = 0; i < amazon.pIndex; i++) {
            if (amazon.products[i].getpId() == id) {

                if (amazon.cIndex < amazon.cart.length) {
                    amazon.cart[amazon.cIndex++] = amazon.products[i];
                    System.out.println("✅ Added to Cart");
                    return;
                } else {
                    System.out.println("❌ Cart Full");
                    return;
                }
            }
        }

        System.out.println("❌ Product Not Found");
    }

    public void viewCart() {
        if (amazon.cIndex == 0) {
            System.out.println("❌ Cart is Empty");
            return;
        }

        for (int i = 0; i < amazon.cIndex; i++) {
            amazon.cart[i].display();
        }
    }
}