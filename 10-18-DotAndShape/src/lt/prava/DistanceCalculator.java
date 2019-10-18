package lt.prava;

/**
 * The most important and the only one method in this class is checkDistance
 * which will return true if radius is smaller than distance between circle
 * center and a point. This class is universal which means that it can be used
 * in modified Point class where point has a reference of a circle object or
 * from main method where circle and point who were already created. That being
 * said, this program will have separate controller class which will create
 * Circle and Point objects. It will also be able to control point.
 * 
 * @author pra-va
 *
 */
public class DistanceCalculator {

	private Limitable itemOne;
	private Limitable itemTwo;
	private double distance;
	private double radius;

	public DistanceCalculator(Limitable itemOne, Limitable itemTwo) {
		this.itemOne = itemOne;
		this.itemTwo = itemTwo;
		this.radius = findRadius();
	}

	public boolean checkDistance() {

		this.distance = distanceBetweenObjects();

		if (distance <= radius) {
			return true;
		} else {
			return false;
		}
	}

	private double distanceBetweenObjects() {

		double itemOneX = this.itemOne.getPositionX();
		double itemOneY = this.itemOne.getPositionY();

		double itemTwoX = this.itemTwo.getPositionX();
		double itemTwoY = this.itemTwo.getPositionY();

		return Math.sqrt(Math.pow(itemOneX - itemTwoX, 2.0) + Math.pow(itemOneY - itemTwoY, 2.0));
	}

	private double findRadius() {

		if (this.itemOne.getRadius() > 0) {
			return itemOne.getRadius();
		} else if (this.itemTwo.getRadius() > 0) {
			return itemTwo.getRadius();
		}

		return -1;
	}

	public double getDistance() {
		return distance;
	}

}
