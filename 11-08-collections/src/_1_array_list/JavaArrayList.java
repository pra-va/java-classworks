package _1_array_list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class JavaArrayList {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();

		System.out.println(numbers);
		for (int i = 0; i < 10; i++) {
			System.out.print(numbers.add(i) + " ");
		}

		System.out.println();
		System.out.println(numbers);

		numbers.remove(5);
		System.out.println(numbers);

		System.out.println("\nLINKED LIST");
		List<Integer> linkedList = new LinkedList<>(numbers);
		System.out.println(linkedList);
		System.out.println(linkedList.getClass());

		// For, ForEach

	}
}
