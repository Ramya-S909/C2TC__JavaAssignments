package Assignments.assignment1;

public class EntityPoduct {
	private int productId;
    private String productName;
    private double price;

    // Constructor
    public Product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    // Display method
    public void displayDetails() {
        System.out.println("Product ID: " + productId +
                           ", Name: " + productName +
                           ", Price: ₹" + price);
    }

}
