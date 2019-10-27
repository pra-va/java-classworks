package lt.pra_va;

public class Main {

	public static void main(String[] args) {
//		Animal animal = new Animal();
//		animal.eat();
//
//		Animal otherAnimal = new Animal() {
//
//			@Override
//			public void eat() {
//				System.out.println("Other animal can eat.");
//			}
//
//		};
//
//		otherAnimal.eat();

		AbleToEat animal = new AbleToEat() {

			@Override
			public void eat() {
				System.out.println("Real animal can eat...");

			}
		};

		animal.eat();

		Animal animal1 = new Animal("Teddy") {

			@Override
			public void sleep() {
				System.out.println("Anonymous animal eats.");

			}
		};

	}

}
