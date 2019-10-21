package lt.prava;

public class Student extends People {

	public Student(String name, double money) {
		super(name, money);
	}

	public void buyOrderable(Orderable orderable) {
		if (orderable.calculateOrderPrice() <= super.getMoney()) {
			System.out.println("Student " + super.getName() + " bought " + orderable.getName() + " for "
					+ orderable.calculateOrderPrice() + ".");
			super.setMoney(super.getMoney() - orderable.calculateOrderPrice());
		} else {
			System.out.println("Student " + super.getName() + " does not have " + orderable.calculateOrderPrice()
					+ " for " + orderable.getName() + ".");
		}

	}

}
