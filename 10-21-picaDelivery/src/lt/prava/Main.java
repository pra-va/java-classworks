package lt.prava;

public class Main {

	public static void main(String[] args) {
		Student one = new Student("Vaclav", 15000.0);
		one.buyOrderable(new Pica(10.2, "Peperoni", 2));
		one.buyOrderable(new Phone(7500, "iPhone XII", 2));

	}

}
