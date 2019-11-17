package lt.prava.creational.builder.builderGood;

public class Director {
	public static void main(String[] args) {
		Contact contactOne = new ContactBuilder().name("Tomas").build();
		Contact contactTwo = new ContactBuilder().name("Tadas").surname("Tadzikas").phone("123456").build();
		System.out.println(contactTwo);
	}
}
