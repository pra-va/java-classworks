package another_example;

public class Main {

	public static void main(String[] args) {
		Gearbox mcLaren = new Gearbox(6);
		Gearbox.Gear first = first = mcLaren.new Gear(1, 12.3);
//		Gearbox.Gear second = new Gearbox.Gear(2, 15.4); // Neveiks
//		Gearbox.Gear third = new mcLaren.Gear(3, 17.8);
		System.out.println(first.driveSpeed(1000));

	}

}
