package _1_Serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadObject {

	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("data.bin");
				ObjectInputStream ois = new ObjectInputStream(fis)) {
//			People people1 = (People) ois.readObject();
//			People people2 = (People) ois.readObject();
//
//			System.out.println(people1);
//			System.out.println(people2);

			People[] peoples = (People[]) ois.readObject();
			System.out.println(Arrays.toString(peoples));
		} catch (IOException e) {
			System.out.println(e);
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}

	}

}
