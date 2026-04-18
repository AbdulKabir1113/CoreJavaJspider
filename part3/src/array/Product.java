package array;

public class Product {

    private int pId;
    private String pName;
    private String brand;
    private double price;

    public Product(int pId, String pName, String brand, double price) {
        this.pId = pId;
        this.pName = pName;
        this.brand = brand;
        this.price = price;
    }

    public int getpId() {
        return pId;
    }

    public String getpName() {
        return pName;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public void display() {
        System.out.println(pId + " | " + pName + " | " + brand + " | ₹" + price);
    }
}