package lt.prava.structural.decorator;

public class BaseCar implements Car {

	@Override
	public int getPrice() {
		return 20000;
	}

	@Override
	public String getCarDescription() {
		return "Base car configuration...";
	}

}
