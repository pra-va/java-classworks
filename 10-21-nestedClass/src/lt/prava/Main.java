package lt.prava;

public class Main {

	public static void main(String[] args) {
		Car car = new Car("Opel", 123456);
		Car.Battery battery = new Car.Battery();
		battery.charge();
	}

}
