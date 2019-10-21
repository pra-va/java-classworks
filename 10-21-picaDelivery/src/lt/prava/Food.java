package lt.prava;

public abstract class Food {

	private double price;
	private String name;
	private int quantity;

	public Food(double price, String name, int quantity) {
		this.price = price;
		this.name = name;
		this.quantity = quantity;
	}

	public double getPrice() {
		return price * quantity;
	}

	public String getName() {
		return name;
	}

	public int getQuantity() {
		return quantity;
	}

}
