package lt.prava.creational.builder.builderWithEnums;

public class Director {
	WebsiteBuilder websiteBuilder;
	
	public void setWebsiteBuilder(WebsiteBuilder websiteBuilder) {
		this.websiteBuilder = websiteBuilder;
	}
	
	Website buildWebsite() {
		websiteBuilder.buildName();
		websiteBuilder.buildCms();
		websiteBuilder.buildPrice();
		Website website = websiteBuilder.getWebsite();
		return website;
	}
}
