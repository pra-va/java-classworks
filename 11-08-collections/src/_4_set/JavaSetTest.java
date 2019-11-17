package _4_set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

// Saugo tik unikalius elementus. Nesaugo pasikartojanciu elementu.
public class JavaSetTest {
	public static void main(String[] args) {
		Set<Integer> hashSet = new HashSet<Integer>();
		Set<Integer> linkedHashSet = new LinkedHashSet<Integer>();
		Set<Integer> treeSet = new TreeSet<Integer>();

		addSetElements(hashSet);
		addSetElements(linkedHashSet);
		addSetElements(treeSet);

//		System.out.println(hashSet);
//		System.out.println(linkedHashSet);
//		System.out.println(treeSet);

		Set<Integer> set1 = new HashSet<Integer>();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		System.out.println(set1);

		Set<Integer> set2 = new HashSet<Integer>();
		set2.add(3);
		set2.add(4);
		set2.add(5);
		set2.add(6);
		System.out.println(set2);

		// UNION
		Set<Integer> union = new HashSet<Integer>(set1);
		union.addAll(set2);
		System.out.println(union);

		// INTERSECTION
		Set<Integer> intersection = new HashSet<Integer>(set1);
		intersection.retainAll(set2);
		System.out.println(intersection);

		// DIFFERENCE
		Set<Integer> difference = new HashSet<Integer>(set1);
		difference.removeAll(set2);
		System.out.println(difference);

	}

	private static void addSetElements(Set<Integer> set) {
		set.add(20);
		set.add(20);
		set.add(5);
		set.add(4);
		set.add(7);
		set.add(100);
	}
}
