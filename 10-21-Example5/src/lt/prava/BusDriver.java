package lt.prava;

public class BusDriver implements Transport, Driver {

	private People driver;
	private String category;
	private double speed;

	@Override
	public void setCategory(String category) {
		if (category != null) {
			this.category = category;
			driver = new People();
		}
	}

	@Override
	public void drive() {
		if (driver != null) {
			System.out.println("The bus is driving.");
		} else {
			System.out.println("The bus stopped.");
		}

	}

	@Override
	public double getSpeed() {
		return this.speed;
	}

}
