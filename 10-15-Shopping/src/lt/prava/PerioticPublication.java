package lt.prava;

public class PerioticPublication extends AbstractProduct implements ShoppingCartItems {
	private static final double PERIODIC_PUBLICATION_VAT = 1.09;

	public PerioticPublication(String name, double price) {
		super(name, price);
	}

	@Override
	public double getVat() {
		return this.PERIODIC_PUBLICATION_VAT;
	}

}
