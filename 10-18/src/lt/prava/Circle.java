package lt.prava;

public class Circle extends Shape implements Paintable {

	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return Math.PI * Math.pow(this.radius, 2);
	}

	@Override
	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}

	@Override
	public boolean paint() {
		return true;
	}

}
