
package lt.prava.structural.decorator;

public class Client {
	public static void main(String[] main) {
		Car car = new HeatingSeats(new BaseCar());
		System.out.println(car);
	}
}
