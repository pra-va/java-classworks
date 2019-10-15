package lt.prava;

public abstract class Animal {
	public String name;
	public long id;

	public Animal(String name, long id) {
		super();
		this.name = name;
		this.id = id;
	}

	public void eat() {
		System.out.println("Animal is sleeping.");
	}

	public abstract void makeSound();
}
