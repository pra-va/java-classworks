package _3_Comparable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class JavaComparable {
	public static void main(String[] args) {
		List<Phone> phonesList = new ArrayList<>();
		Set<Phone> phoneSet = new TreeSet<>();

		addElements(phonesList);
//		addElements(phoneSet);

		Collections.sort(phonesList);
//		Collections.sort(phoneSet);

		System.out.println(phonesList);

	}

	private static void addElements(Collection collection) {
		collection.add(new Phone("Red", 150.0));
		collection.add(new Phone("Blue", 164.0));
		collection.add(new Phone("Green", 250.0));
	}

}
