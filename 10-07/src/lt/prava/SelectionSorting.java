/**
 * Unsorted. 100000 random members - 1286ms;
 * Sorted. 100000 random members - 1097ms;
 * Same 100000 values - 1051ms.
 * 
 */

package lt.prava;

import java.nio.channels.MembershipKey;
import java.util.Arrays;
import java.util.Random;

public class SelectionSorting {
	private static int[] numbers = new int[100000];

	public static void main(String[] args) {
		fillArray(numbers);
//		System.out.println(Arrays.toString(numbers));
//		Arrays.sort(numbers);
		selectionSorting(numbers);
//		printArray(numbers);
//		System.out.println(Arrays.toString(numbers));

	}

	private static void selectionSorting(int[] numbers) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < numbers.length; i++) {
			int smallestMember = numbers[i];
			int smallestIndex = i;
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[j] < smallestMember) {
					smallestMember = numbers[j];
					smallestIndex = j;
				}
			}
			
			if (smallestIndex != i) {
				numbers[i] = numbers[i] ^ numbers[smallestIndex];
				numbers[smallestIndex] = numbers[i] ^ numbers[smallestIndex];
				numbers[i] = numbers[i] ^ numbers[smallestIndex];
			}
			
		}

		long end = System.currentTimeMillis();
		System.out.println(end - start);

	}

	private static void fillArray(int[] numbers) {
		Random random = new Random();
		for (int i = 0; i < numbers.length; i++) {
//			numbers[i] = random.nextInt(100);
			numbers[i] = 1;
		}
	}

	private static void printArray(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}

}
