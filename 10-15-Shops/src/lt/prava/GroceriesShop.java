package lt.prava;

public class GroceriesShop extends ShopGeneral {
	private double uniqueGroceriesTax;

	public GroceriesShop(String type, Item[] items, String location, boolean hasLicence, double uniqueGroceriesTax) {
		super(type, items, location, hasLicence);
		this.uniqueGroceriesTax = uniqueGroceriesTax;
	}
}
