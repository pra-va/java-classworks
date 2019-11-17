package lt.prava.creational.builder.builderWithEnums;

public class Client {
	public static void main(String[] args) {
		Director director = new Director();
		director.setWebsiteBuilder(new PortfolioWebsite());
		Website website = director.buildWebsite();
	}

}

// Namuose pabandyti su builderiu gaminti automobilius su skirtingais parametrais uz skirtinga kaina.