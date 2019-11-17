package lt.prava.creational.builder.builderWithEnums;

public abstract class WebsiteBuilder {
	Website website;

	abstract void buildName();

	abstract void buildCms();

	abstract void buildPrice();

	void createWebsite() {
		this.website = new Website();
	}

	Website getWebsite() {
		return this.website;
	}

	@Override
	public String toString() {
		return "WebsiteBuilder [website=" + website + "]";
	}

}
