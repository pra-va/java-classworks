package lt.prava;

public class ShopGeneral {
	private String type;
	private Item[] items;
	private String location;
	private boolean hasLicence;

	public ShopGeneral(String type, Item[] items, String location, boolean hasLicence) {
		super();
		this.type = type;
		this.items = items;
		this.location = location;
	}

	public boolean isHasLicence() {
		return hasLicence;
	}

	public void setHasLicence(boolean hasLicence) {
		this.hasLicence = hasLicence;
	}

}
