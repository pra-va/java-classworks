package lt.prava;

public class People {

	private String name;
	private int age;
	static String description = "Stupid human"; // STATIC
	static int popleCounter = 0;

	public People(String name, int age) {
		this.name = name;
		this.age = age;
		popleCounter++;
	}

	static void peopleCanSay() {
		System.out.println("Hello");
	}

	@Override
	public String toString() {
		return "Human " + name + ", age " + age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
