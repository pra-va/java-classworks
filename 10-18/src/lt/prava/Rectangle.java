package lt.prava;

public class Rectangle extends Shape { // Realizuoja, isipareigoja

	private double height;
	private double width;

	public Rectangle(double height, double width) {
		this.height = height;
		this.width = width;
	}

	@Override
	public double getArea() {
		return this.height * this.width;
	}

	@Override
	public double getPerimeter() {
		return this.height * 2 + this.width * 2;
	}

}
