package lt.prava;

public class Point implements Moveable, HasCoordinates {

	private int positionX;
	private int positionY;

	public Point(int positionX, int positionY) {
		// TODO Pasitikrinti ar tasksa pataiko i apskritima. Jei ne - fale.
		this.positionX = positionX;
		this.positionY = positionY;
	}

	@Override
	public void moveUp() {
		this.positionY++;
	}

	@Override
	public void moveDown() {
		this.positionY--;
	}

	@Override
	public void moveLeft() {
		this.positionX--;
	}

	@Override
	public void moveRight() {
		this.positionX++;
	}

	@Override
	public int getPositionX() {
		return positionX;
	}

	@Override
	public int getPositionY() {
		return positionY;
	}

	@Override
	public String toString() {
		return "Point [positionX=" + positionX + ", positionY=" + positionY + "]";
	}

}
