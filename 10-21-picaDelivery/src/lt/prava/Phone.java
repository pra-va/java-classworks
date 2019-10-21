package lt.prava;

public class Phone extends ElectronicDevice implements Orderable, Deliverable {

	public Phone(double price, String name, int quantity) {
		super(price, name, quantity);
	}

	@Override
	public double calculateDeliveryPrice() {
		if (super.getPrice() >= 50.0) {
			return 0.0;
		}
		return 5.0;
	}

	@Override
	public double calculateOrderPrice() {
		return calculateDeliveryPrice() + super.getPrice();
	}

}
