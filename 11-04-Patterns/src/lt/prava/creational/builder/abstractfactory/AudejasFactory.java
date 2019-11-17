package lt.prava.creational.builder.abstractfactory;

public class AudejasFactory implements AbstractFactory {

	@Override
	public Table makeTable() {
		return new AudejasTable();
	}

	@Override
	public Chair makeChair() {
		return new AudejasChair();
	}

}
