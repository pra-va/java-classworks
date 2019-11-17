package _2_linked_list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class JavaLinkedList {

	public static void main(String[] args) {
		List<Integer> arrayList = new ArrayList<>();
		List<Integer> linkedList = new LinkedList<>();
//		linkedList.add(12);
//		linkedList.add(20);
//		System.out.println(linkedList);
//		linkedList.remove(0);
//		System.out.println(linkedList);

		fillListLinear(linkedList);
		fillListLinear(arrayList);

		measureTime(arrayList);
		measureTime(linkedList);

	}

	private static void measureTime(List<Integer> list) {
		long start = System.currentTimeMillis();

//		fillListLinear(list);
//		fillListByFirst(list);
//		fillListRandom(list);
//		removeListElementsLinear(list);
//		removeFirstElement(list);
		removeRandomElement(list);
		System.out.println(list.size());

		long end = System.currentTimeMillis();
		System.out.println("Time: " + (end - start) + " ms (" + list.getClass() + ").");
	}

	private static void fillListLinear(List<Integer> list) {
		for (int i = 0; i < 100000; i++) {
			list.add(i);
		}
	}

	private static void fillListByFirst(List<Integer> list) {
		for (int i = 0; i < 100000; i++) {
			list.add(0, i);
		}
	}

	private static void fillListRandom(List<Integer> list) {
		list.add(10);
		for (int i = 0; i < 100000; i++) {
			list.add((int) Math.random() * list.size(), i);
		}
	}

	private static void removeListElementsLinear(List<Integer> list) {
		for (int i = 0; i < 100_000; i++) {
			list.remove(list.size() - 1);
		}
	}

	private static void removeFirstElement(List<Integer> list) {
		for (int i = 0; i < 100_000; i++) {
			list.add((int) Math.random() * list.size(), i);
		}
	}

	private static void removeRandomElement(List<Integer> list) {
		for (int i = 0; i < 100_000; i++) {
			list.remove((int) Math.random() * list.size());
		}
	}

}
