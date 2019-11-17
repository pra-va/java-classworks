package lt.prava.structural.decorator;

public class CarDecorator implements Car {

	protected final Car car;

	public CarDecorator(Car car) {
		this.car = car;
	}

	@Override
	public int getPrice() {
		return car.getPrice();
	}

	@Override
	public String getCarDescription() {
		return car.getCarDescription();
	}

}
