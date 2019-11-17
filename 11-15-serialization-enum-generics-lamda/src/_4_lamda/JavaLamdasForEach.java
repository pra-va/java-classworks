package _4_lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class JavaLamdasForEach {

	// Paimti int masyva 100k ir surusiuoti su bubble, o kita su lamdomis streamais

	public static void main(String[] args) {
		int[] intArray = new int[10];
		List<Integer> integerList = new ArrayList<>();

		fillArray(intArray);
		fillList(integerList);

		System.out.println(integerList);
		System.out.println(Arrays.toString(intArray));

		// MAP method
		intArray = Arrays.stream(intArray).map(a -> a * 3).toArray();
		System.out.println(Arrays.toString(intArray));
		integerList = integerList.stream().map(a -> a + 1).collect(Collectors.toList());
		System.out.println(integerList);

		// FILTER method
		intArray = Arrays.stream(intArray).filter(a -> a % 2 == 0).toArray();
		System.out.println(Arrays.toString(intArray));

		// REDUCE method
		int sum = Arrays.stream(intArray).reduce((acumulator, b) -> acumulator + b).getAsInt();
		System.out.println(sum);

		Set<Integer> hashSet = new HashSet<>();
		hashSet.add(1);
		hashSet.add(2);
		hashSet.add(3);
		System.out.println(hashSet);
		hashSet = hashSet.stream().map(a -> a * 3).filter(a -> a % 2 == 0).collect(Collectors.toSet());

	}

	private static void fillList(List<Integer> integerList) {
		for (int i = 0; i < 10; i++) {
			integerList.add(i + 1);
		}
	}

	private static void fillArray(int[] intArray) {
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = i + 1;
		}
	}

}
