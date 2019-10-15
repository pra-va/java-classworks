package lt.prava;

public class Fish extends Animal {

	public Fish(String name, long id) {
		super(name, id);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void makeSound() {
		System.out.println("???");
	}

}
