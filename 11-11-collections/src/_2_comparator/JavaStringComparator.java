package _2_comparator;

import java.util.Comparator;

public class JavaStringComparator implements Comparator<String> {
	/*
	 * o1 > o2 -> 1 o1 < o2 -> -1 o1 == o2 -> 0
	 * 
	 * compare(2, 1) -> -1; compare(1, 2) -> 1; compare(1, 1) -> 0;
	 */

	@Override
	public int compare(String o1, String o2) {
		if (o1.length() > o2.length()) {
			return 1;
		} else if (o1.length() < o2.length()) {
			return -1;
		} else if (o1.length() == o1.length()) {
			return 0;
		}
		return 0;
	}

}
