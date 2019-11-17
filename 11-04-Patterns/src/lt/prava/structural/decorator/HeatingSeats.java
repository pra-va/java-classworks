package lt.prava.structural.decorator;

public class HeatingSeats extends CarDecorator {

	public HeatingSeats(Car car) {
		super(car);
	}

	@Override
	public int getPrice() {
		return super.getPrice() + 3000;
	}

	@Override
	public String getCarDescription() {
		return super.getCarDescription() + " Heated seats";
	}

	@Override
	public String toString() {
		return "HeatingSeats [getPrice()=" + getPrice() + ", getCarDescription()=" + getCarDescription() + "]";
	}

}
