package lt.prava.creational.builder.builderWithEnums;

public class LandingWebsite extends WebsiteBuilder {

	@Override
	void buildName() {
		System.out.println("Landing Website");

	}

	@Override
	void buildCms() {
		System.out.println(Cms.LARAVEL);

	}

	@Override
	void buildPrice() {
		System.out.println("500");

	}

}
