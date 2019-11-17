package lt.prava.creational.builder.builderWithEnums;

public class PortfolioWebsite extends WebsiteBuilder {

	@Override
	void buildName() {
		System.out.println("Portfolio website");

	}

	@Override
	void buildCms() {
		System.out.println(Cms.WORDORESS);

	}

	@Override
	void buildPrice() {
		System.out.println(100);
	}

	@Override
	public String toString() {
		return "PortfolioWebsite [website=" + website + "]";
	}

}
