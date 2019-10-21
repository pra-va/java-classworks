package lt.prava;

public class Main {

	public static void main(String[] args) {

		Transport busDriverOne = new BusDriver();
		busDriverOne.drive();
		busDriverOne.getSpeed();

		Driver busDriverTwo = new BusDriver();
		busDriverTwo.setCategory("C");
		BusDriver busDriverThree = new BusDriver();
		busDriverThree.setCategory("D");
		busDriverThree.drive();
		busDriverThree.getSpeed();
	}

}
