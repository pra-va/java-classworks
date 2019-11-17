package lt.prava.behavioral.strategy;

public class CardTester {
	public static void main(String[] args) {
		CreditCard master = new CreditCard(new MasterCardStrategy());

		master.setNumber("5464313");
		System.out.println("Master card validation: " + master.isValid());
	}
}
