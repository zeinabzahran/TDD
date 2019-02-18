
public class Book {
	private String name;
	private double price;
	private int quantity;
	
	public Book(String name, int quantity, double price) {
		this.name =name;
		this.quantity = quantity;
		this.price = price;
	}
	public double getPrice() {
		return this.price;
	}
	
}
