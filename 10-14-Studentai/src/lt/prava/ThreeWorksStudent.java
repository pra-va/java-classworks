package lt.prava;

public class ThreeWorksStudent extends Student {
	private boolean works;

	public ThreeWorksStudent(String name, int age, boolean passedExams) {
		super(name, age, passedExams);
		this.works = true;
	}

	public boolean isWorks() {
		return works;
	}

}
