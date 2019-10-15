package lt.prava;

public class FourDoesNotWorkStudent extends Student {

	private boolean works;

	public FourDoesNotWorkStudent(String name, int age, boolean passedExams) {
		super(name, age, passedExams);
		this.works = false;
	}

	public boolean isWorks() {
		return works;
	}
}
