package lt.prava;

public abstract class AbstractProduct {
	private String name;
	private double price;

	public AbstractProduct(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public double getPriceWtihVat() {
		return this.price * this.getVat();
	}

	public abstract double getVat();
}
