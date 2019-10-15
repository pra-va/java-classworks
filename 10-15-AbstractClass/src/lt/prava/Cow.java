package lt.prava;

public class Cow extends Animal implements Info {

	public Cow(String name, long id) {
		super(name, id);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void makeSound() {
		System.out.println("Muuuuuuuuuuuuuuuuuu.... ");

	}

	@Override
	public void getInfo() {
		System.out.println("Name: " + this.name + ", ID: " + this.id);
	}

}
