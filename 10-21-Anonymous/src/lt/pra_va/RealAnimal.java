package lt.pra_va;

public class RealAnimal extends Animal implements AbleToEat {

	public RealAnimal(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eat() {
		System.out.println("Eats...");

	}

	@Override
	public void sleep() {
		System.out.println("Sleeps...");

	}

}
