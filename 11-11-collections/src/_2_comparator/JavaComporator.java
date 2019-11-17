package _2_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class JavaComporator {

	public static void main(String[] args) {
		List<String> animals = new ArrayList<>();
		animals.add("cat");
		animals.add("dog");
		animals.add("bird");
		animals.add("fish");
		animals.add("snake");

		Collections.sort(animals); // Natural order
		System.out.println(animals);
		Collections.sort(animals, new JavaStringComparator());
		System.out.println(animals);

		List<Integer> numbers = new ArrayList<>();
		numbers.add(56);
		numbers.add(6);
		numbers.add(36);
		numbers.add(2);
		numbers.add(-4);

		Collections.sort(numbers);
		Collections.sort(numbers, new JavaIntegerComporator());
		System.out.println(numbers);

		List<Developer> developers = new ArrayList<>();

		developers.add(new Developer(1500));
		developers.add(new Developer(10254));
		developers.add(new Developer(1254));
		developers.add(new Developer(516));
		developers.add(new Developer(0));

		Collections.sort(developers, new JavaDeveloperComparator());
		System.out.println(developers);

		Collections.sort(developers, new Comparator<Developer>() {
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
		});

	}

}
