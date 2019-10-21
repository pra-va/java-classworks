package lt.prava;

public class Pica extends Food implements Orderable, Deliverable {

	public Pica(double price, String name, int quantity) {
		super(price, name, quantity);
	}

	@Override
	public double calculateDeliveryPrice() {
		return 3.0 + super.getQuantity() * 2.0;
	}

	@Override
	public double calculateOrderPrice() {
		return super.getPrice() + calculateDeliveryPrice();
	}

}
