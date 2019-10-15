package lt.prava;

public class Product extends AbstractProduct implements ShoppingCartItems {
	private static final double PRODUCT_VAT = 1.21;

	public Product(String name, double price) {
		super(name, price);

	}

	@Override
	public double getVat() {
		return this.PRODUCT_VAT;
	}

}
