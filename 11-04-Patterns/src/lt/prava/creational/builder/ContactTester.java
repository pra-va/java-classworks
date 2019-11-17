package lt.prava.creational.builder;

public class ContactTester {

	public static void main(String[] args) {
		Contact contact = new Contact("Tomas", "Tribusauskas", "tt@gmail.com", "123456", "Lentvario 13");
		Contact contactTwo = new Contact("Gintare", "231231231231");
		System.out.println(contactTwo);
	}

}
