package lt.prava.creational.builder.lunch;

public class LunchOrder {
	private Product bread;
	private Product meat;
	private Product butter;
	private Product coffe;
	private double lunchPrice = 0;

	public LunchOrder(LunchBuilder lunchBuilder) {
		this.bread = lunchBuilder.getBread();
		this.meat = lunchBuilder.getMeat();
		this.butter = lunchBuilder.getButter();
		this.coffe = lunchBuilder.getCoffe();
	}

	@Override
	public String toString() {

		StringBuilder builder = new StringBuilder();
		if (bread != null) {
			builder.append("bread=" + this.bread.getName() + " " + bread.getPrice() + "\n");
			this.lunchPrice += bread.getPrice();
		}
		if (meat != null) {
			builder.append("meat=" + this.meat.getName() + " " + bread.getPrice() + "\n");
			this.lunchPrice += meat.getPrice();
		}
		if (butter != null) {
			builder.append("butter=" + this.butter.getName() + " " + bread.getPrice() + "\n");
			this.lunchPrice += butter.getPrice();
		}
		if (coffe != null) {
			builder.append("coffe=" + this.coffe.getName() + " " + bread.getPrice() + "\n");
			this.lunchPrice += coffe.getPrice();
		}

		return builder.toString();
	}

}
