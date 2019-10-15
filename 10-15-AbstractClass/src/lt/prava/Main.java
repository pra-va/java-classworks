package lt.prava;

public class Main {

	public static void main(String[] args) {
		Info cow = new Cow("Marge", 321321);
		Info worker = new People("Dave", 30);
		cow.getInfo();
		worker.getInfo();
	}

}
