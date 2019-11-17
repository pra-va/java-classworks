package _3_generics;

public class GenericsMethods {

	public static void main(String[] args) {
		Integer[] intArray = { 1, 26, 3, 4, 5, -11 };
		Double[] doubleArray = { 1.0, 2.0, 3.0, 4.0, 5.0, 53.3, 1.56 };
		String[] stringArray = { "one", "two", "three", "four", "five", "zzzz" };

		printArray(intArray);
		printArray(doubleArray);
		printArray(stringArray);

		System.out.println(findMax(intArray));
		System.out.println(findMax(doubleArray));
//		System.out.println(findMax(stringArray));

		// DO NOT REPEAT YORSELF!!!!!!!!!!
	}

	// Parasyti objekta, kuris gales priimti bet koki tipa (bagazine, kurioje galime
	// deti bet ka), klase abstrakti, tada ispleciame objekta
	// i automobili ir pan.

	private static <T extends Number & Comparable<T>> T findMax(T[] array) {

		T largestMember = array[0];
		for (T element : array) {
			if (element.compareTo(largestMember) > 0) {
				largestMember = element;
			}
		}

		return largestMember;
	}

	private static <T> void printArray(T[] array) {
		System.out.println("Generic method!!!");
		for (T element : array) {
			System.out.print(element + " ");
		}
		System.out.println();
	}
//
//	private static void printArray(Double[] doubleArray) {
//		System.out.println("Non generic method!!!");
//		for (Double doub : doubleArray) {
//			System.out.print(doub + " ");
//		}
//		System.out.println();
//	}
//
//	private static void printArray(Integer[] intArray) {
//		System.out.println("Non generic method!!!");
//		for (Integer integer : intArray) {
//			System.out.print(integer + " ");
//		}
//		System.out.println();
//	}

}
