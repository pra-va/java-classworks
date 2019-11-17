package lt.prava.creational.builder.abstractfactory;

public class IkeaFactory implements AbstractFactory {

	@Override
	public Table makeTable() {
		return new IkeaTable();
	}

	@Override
	public Chair makeChair() {
		return new IkeaChair();
	}

}
