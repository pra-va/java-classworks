package lt.prava.creational.builder.abstractfactory;

public class Client {

	public static void main(String[] args) {

		AbstractFactory myUab = new AudejasFactory();
		myUab.makeTable().produce();

	}

}
