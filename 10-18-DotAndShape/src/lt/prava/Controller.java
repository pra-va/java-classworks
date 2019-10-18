package lt.prava;

/**
 * This class controls DistanceCalculator, Point and Distance objects. See also
 * DistanceCalculator info.
 * 
 * @author pra-va
 *
 */
public class Controller implements Moveable {

	private Circle circle;
	private Point point;
	private DistanceCalculator distanceCalculator;

	public Controller(int circleRadius, int circleCenterXposition, int circleCenterYposition, int pointXposition,
			int pointYposition) {
		System.out.println("Drawing CIRCLE... Dropping POINT...");
		this.circle = new Circle(circleRadius, circleCenterXposition, circleCenterYposition);
		this.point = new Point(pointXposition, pointYposition);
		this.distanceCalculator = new DistanceCalculator(point, circle);
		checkPosition();
	}

	public Controller(Circle circle, Point point) {
		this.circle = circle;
		this.point = point;
		this.distanceCalculator = new DistanceCalculator(point, circle);
		checkPosition();
	}

	private void checkPosition() {
		if (this.distanceCalculator.checkDistance()) {
			System.out.println("The point is INSIDE the circle. (radius = " + this.circle.getRadius() + "; distance = "
					+ Math.round(this.distanceCalculator.getDistance() * 100.0) / 100.0 + "; pointX = "
					+ this.point.getPositionX() + "; pointY = " + this.point.getPositionY() + ")");
		} else {
			System.out.println("The point is OUTSIDE the circle. (radius = " + this.circle.getRadius() + "; distance = "
					+ Math.round(this.distanceCalculator.getDistance() * 100.0) / 100.0 + "; pointX = "
					+ this.point.getPositionX() + "; pointY = " + this.point.getPositionY() + ")");
		}
	}

	@Override
	public void moveUp() {
		System.out.println("\nMoving UP!");
		this.point.moveUp();
		checkPosition();
	}

	@Override
	public void moveDown() {
		System.out.println("\nMoving DOWN!");
		this.point.moveDown();
		checkPosition();
	}

	@Override
	public void moveLeft() {
		System.out.println("\nMoving LEFT!");
		this.point.moveLeft();
		checkPosition();
	}

	@Override
	public void moveRight() {
		System.out.println("\nMoving RIGHT!");
		this.point.moveRight();
		checkPosition();
	}

}
