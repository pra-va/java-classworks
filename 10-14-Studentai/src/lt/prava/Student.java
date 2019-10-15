package lt.prava;

public class Student {
	// Turi skola, neturi skolos, dirba, nedirba
	// I masyva patalpinti dirbancius ir nedirbancius
	private String name;
	private int age;
	private boolean passedExams;

	public Student(String name, int age, boolean passedExams) {
		this.name = name;
		this.age = age;
		this.passedExams = passedExams;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public boolean isPassedExams() {
		return passedExams;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", passedExams=" + passedExams + "]";
	}

}
