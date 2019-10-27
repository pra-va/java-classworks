package lt.prava;

// TODO
public interface Priceable extends Orderable, Deliverable {
	default double calculatePrice() {
		return calculateDeliveryPrice() + calculateOrderPrice();
	}
}
