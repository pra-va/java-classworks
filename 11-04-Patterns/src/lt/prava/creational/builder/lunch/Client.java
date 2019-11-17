package lt.prava.creational.builder.lunch;

public class Client {

	public static void main(String[] args) {
		LunchOrder myLunch = new LunchBuilder().bread("Toste").butter("Sviestas").meat("Desra").build();
		System.out.println(myLunch);

	}

}
