package lt.prava;

public class Animal {
	private String name;
	private int age;

	public Animal(String name, int age) {
		super();
		this.name = name;
	}

	public void sleep() {
		System.out.println("Animal is sleaping.");
	}

	public void eat() {
		System.out.println("Animal is eating.");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Animal " + name;
	}

}
