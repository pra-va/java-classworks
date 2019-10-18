package lt.prava;

public class Main {

	public static void main(String[] args) {
		Circle circle = new Circle(10, 0, 0);
		Point point = new Point(10, 0);

		System.out.println(point.toString());
		point.moveDown();
		System.out.println(point.toString());
	}

}
