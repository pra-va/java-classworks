package lt.prava;

public abstract class ElectronicDevice {

	private double price;
	private String name;
	private int quantity;

	public ElectronicDevice(double price, String name, int quantity) {
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
