package lt.prava;

public class Checkout {
	public static void main(String[] args) {
		People one = new People("Tomas", 25);
		People two = new People("Tadas", 22);
		People three = new People("Timi", 22);

		System.out.println(one.getName() + " " + one.getAge());
		System.out.println(two.getName() + " " + two.getAge());

		one.description = "???";

		System.out.println(one.description);
		System.out.println(two.description);

		two.description = "...";

		System.out.println(one.description);
		System.out.println(two.description);

		System.out.println(one.popleCounter);
		System.out.println(two.popleCounter);

//		one.peopleCanSay();
		People.peopleCanSay();
	}
}
