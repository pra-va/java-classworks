package _2_comparator;

import java.util.Comparator;

public class JavaDeveloperComparator implements Comparator<Developer> {

	@Override
	public int compare(Developer o1, Developer o2) {
		if (o1.getCodeLineNumber() < o2.getCodeLineNumber()) {
			return 1;
		} else if (o1.getCodeLineNumber() > o2.getCodeLineNumber()) {
			return -1;
		}
		if (o1.getCodeLineNumber() == o2.getCodeLineNumber()) {
			return 0;
		}
		return 0;
	}

}
