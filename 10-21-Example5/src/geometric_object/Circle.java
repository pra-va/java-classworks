package geometric_object;

public class Circle implements GeometricObject {

	private double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public double getPerimeter() {
		return 2 * Math.PI * this.radius;
	}

	@Override
	public double getArea() {
		return Math.PI * Math.pow(this.radius, 2);
	}

	public double getRadius() {
		return radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

}
