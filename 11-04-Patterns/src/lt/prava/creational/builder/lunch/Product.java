package lt.prava.creational.builder.lunch;

public abstract class Product {
	private double price;
	private String name;

	public Product(double price, String name) {
		this.price = price;
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public String getName() {
		return name;
	}

	public double getPriceWithDiscount(double discount) {
		return this.price - this.price * discount;
	}

	public void setPrice(double newPrice) {
		this.price = newPrice;
	}

}
