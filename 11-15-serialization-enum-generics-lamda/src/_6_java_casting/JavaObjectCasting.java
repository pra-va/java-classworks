package _6_java_casting;

public class JavaObjectCasting {

	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.eat();

		Dog dog = new Dog();
		dog.eat();
		dog.bark();

		// Upacasting
		Animal otherAnimal = new Dog();
		otherAnimal.eat(); // voice (bark) lost

		// Downcast
		Dog otherDog = (Dog) otherAnimal; // Not safe conversion!!!!
		otherDog.eat();
		otherDog.bark();

		// Primitive type casting
		// Implicit casting - pleciame diapazona
		byte byteNumber = 25;
		short shortNumber = byteNumber; // safe conversion
		double doubleNumber = shortNumber;

		// Explicit casting
		byte number = (byte) doubleNumber; // Not safe conversion
	}

}
