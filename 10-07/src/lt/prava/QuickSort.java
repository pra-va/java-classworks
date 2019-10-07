/**
 * Unsorted. 100000 random members - 37ms;
 * Sorted. 100000 random members - 92ms;
 * Same 100000 values - Stack Overflow...
 * 
 */

package lt.prava;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {
	private static int[] numbers = new int[100000];

	public static void main(String[] args) {
		fillArray(numbers);
//		Arrays.sort(numbers);
		quicSortInitializer(numbers);
//		System.out.println(Arrays.toString(numbers));
	}

	private static void quicSortInitializer(int[] numbers) {
		long start = System.currentTimeMillis();
		quickSort(numbers, 0, numbers.length -1);
		long end = System.currentTimeMillis();
		System.out.println("Sorting took: " + (end - start) + " ms");
	}

	private static void quickSort(int[] numbers, int start, int end) {
		if (start < end) {
			int pivotIndex = partition(numbers, start, end);
//			System.out.println(pivotIndex);
			quickSort(numbers, start, pivotIndex - 1);
			quickSort(numbers, pivotIndex + 1, end);
		}
	}

	private static int partition(int[] numbers, int start, int end) {
		int pivot = numbers[end];
		int pivotIndex = start - 1;
		for (int i = start; i < end; i++) {
			if (numbers[i] < pivot) {
				pivotIndex++;
				int tmp = numbers[pivotIndex];
				numbers[pivotIndex] = numbers[i];
				numbers[i] = tmp;
			}
		}
		
		int tmp = numbers[end];
		numbers[end] = numbers[pivotIndex + 1];
		numbers[pivotIndex + 1] = tmp;
		
		return pivotIndex + 1;
	}

	private static void fillArray(int[] numbers) {
		Random random = new Random();
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = random.nextInt(100);
//			numbers[i] = 1;
		}
	}

	private static void printArray(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}

}
