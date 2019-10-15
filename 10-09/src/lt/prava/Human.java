package lt.prava;

public class Human {
	private double height;
	private double weight;
	private String name;

	public Human(double height, double weight, String name) {
		this.height = height;
		this.weight = weight;
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

}
