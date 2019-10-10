package lt.prava;

/**
 * Main class. Create House object/s and room array. Accommodate students using
 * accomodateStudent method from house class.
 * 
 * @author pra-va
 *
 */
public class StudentsAndHouses {
	public static void main(String[] args) {
		Student[] students = { new Student("Tomas", 25), new Student("Dave", 30), new Student("Ruta", 19),
				new Student("Tadas", 20), new Student("Monika", 21), new Student("Greta", 18),
				new Student("Petras", 27), new Student("Romas", 55) };
		House kamciatka = new House(1, 5, "Sauletekio g. 18");
		kamciatka.accomodateStudent(students);
		kamciatka.printRoomList();

	}

}
