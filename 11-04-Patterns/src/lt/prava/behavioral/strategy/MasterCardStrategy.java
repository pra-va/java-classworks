package lt.prava.behavioral.strategy;

public class MasterCardStrategy extends ValidationStrategy {

	@Override
	public boolean isValid(CreditCard creditCard) {
		boolean isValid = true;

		isValid = creditCard.getNumber().length() == 16;
		isValid = creditCard.getNumber().startsWith("5");
		return isValid;
	}

}
