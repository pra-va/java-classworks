package lt.prava;

public class Circle implements Limitable {

	private int radius;
	private int centerX;
	private int centerY;

	public Circle(int radius, int centerX, int centerY) {
		this.radius = radius;
		this.centerX = centerX;
		this.centerY = centerY;
	}

	@Override
	public int getRadius() {
		return radius;
	}

	@Override
	public int getPositionX() {
		return centerX;
	}

	@Override
	public int getPositionY() {
		return centerY;
	}

}
