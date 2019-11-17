package _4_iterable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class JavaIterable {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(10);
		numbers.add(12);
		numbers.add(2);
		numbers.add(5);
		System.out.println(numbers);

		// Before Java 5
		Iterator<Integer> iterator = numbers.iterator();
		int index = 1;
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
			if (index == 1) {
				iterator.remove();
				index++;
			}
		}
		System.out.println();
		System.out.println(numbers);

		// Since Java 5
//		for (Integer number : numbers) {
//			System.out.print(number + " ");
//		}

	}

}
