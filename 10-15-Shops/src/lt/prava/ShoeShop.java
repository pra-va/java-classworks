package lt.prava;

public class ShoeShop extends ShopGeneral {
	private ShoeMaker shoeMaker;
	private String network;

	public ShoeShop(String type, Item[] items, String location, ShoeMaker shoeMaker, String network, boolean licence,
			String[][] shoeMakerPrices) {
		super(type, items, location, licence);
		this.shoeMaker = shoeMaker;
		this.network = network;
		this.shoeMaker = new ShoeMaker(shoeMakerPrices);
	}

	public ShoeMaker getShoeMaker() {
		return shoeMaker;
	}

	public void setShoeMaker(ShoeMaker shoeMaker) {
		this.shoeMaker = shoeMaker;
	}
}
