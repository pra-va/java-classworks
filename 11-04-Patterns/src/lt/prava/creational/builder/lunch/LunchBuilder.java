package lt.prava.creational.builder.lunch;

public class LunchBuilder {
	private Product bread;
	private Product meat;
	private Product butter;
	private Product coffe;

	public LunchBuilder() {
	}

	public LunchOrder build() {
		return new LunchOrder(this);
	}

	public LunchBuilder bread(Product bread) {
		this.bread = bread;
		return this;
	}

	public LunchBuilder meat(Product meat) {
		this.meat = meat;
		return this;
	}

	public LunchBuilder butter(Product butter) {
		this.butter = butter;
		return this;
	}

	public LunchBuilder coffe(Product coffe) {
		this.coffe = coffe;
		return this;
	}

	public Product getBread() {
		return bread;
	}

	public Product getMeat() {
		return meat;
	}

	public Product getButter() {
		return butter;
	}

	public Product getCoffe() {
		return coffe;
	}

}
