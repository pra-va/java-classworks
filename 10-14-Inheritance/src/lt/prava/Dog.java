package lt.prava;

public class Dog extends Animal {
	private String color;
	private int weight;
	public static final int LEGS_NUMBER = 4;

	public Dog(String name, int age, String color) {
		super(name, age);
		this.color = color;
	}

	@Override
	public void eat() {
		System.out.println("Dog is eating.");
	}

	public void bark() {
		System.out.println("Dog is barking.");
	}

	@Override
	public String toString() {
		return "Dog [ name=" + super.getName() + "]";
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
}
