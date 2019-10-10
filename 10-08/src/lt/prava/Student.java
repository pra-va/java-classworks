package lt.prava;

/**
 * Student defining class.
 * 
 * @author pra-va
 *
 */
public class Student {
	private String name;
	private int age;

	/**
	 * This is Student class constructor
	 * 
	 * @param name
	 * @param age
	 */
	public Student(String name, int age) {
		if (name == null) {
			// New exception
			System.out.println("Student instance has no name.");
		} else if (age == 0) {
			// New exception
			System.out.println("Student instance has no age.");
		} else {
			this.name = name;
			this.age = age;
		}
	}

	/**
	 * This method will print out student info.
	 */
	@Override
	public String toString() {
		return name + " (" + age + ")";
	}

	/**
	 * Getter method for Student class name.
	 * 
	 * @return
	 */
	public String getName() {
		return name;
	}
}
