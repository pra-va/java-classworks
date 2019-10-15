package lt.prava;

public class Cat extends Animal {

	public Cat(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eat() {
		System.out.println("Cat is eating.");
	}

	public void meow() {
		System.out.println("Dog is barking.");
	}

}
