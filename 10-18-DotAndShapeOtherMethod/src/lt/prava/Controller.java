package lt.prava;

public class Controller {
	private HasCoordinates circle;
	private HasCoordinates point;

	public Controller(int circleRadius, int circleCenterX, int circleCenterY, int pointX, int pointY) {
		super();
		this.circle = new Circle(circleRadius, circleCenterX, circleCenterX);
		this.point = new Point(pointX, pointY);
	}

	public HasCoordinates getCircle() {
		return circle;
	}

	public HasCoordinates getPoint() {
		return point;
	}

	public void checkPointPosition() {

	}

}
