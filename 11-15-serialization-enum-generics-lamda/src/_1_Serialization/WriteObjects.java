package _1_Serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjects {

	public static void main(String[] args) {

		People people = new People(1, "Tomas", "Tomaitis", 22);
		People people2 = new People(1, "Richard", "Richarowich", 32);

		People[] peoples = { people, people2 };

		try (FileOutputStream fos = new FileOutputStream("data.bin");
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {

//			oos.writeObject(people);
//			oos.writeObject(people2);

			oos.writeObject(peoples);
		} catch (IOException exception) {
			exception.printStackTrace();
		}

	}

}
