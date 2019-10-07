/**
 * Unsorted. 100000 random members - 53ms;
 * Sorted. 100000 random members - 25ms;
 * Same 100000 values - 22ms.
 * 
 */

package lt.prava;

import java.util.Arrays;
import java.util.Random;

public class MergeSort {
	private static int[] numbers = new int[100000];

	public static void main(String[] args) {
		fillArray(numbers);
//		Arrays.sort(numbers);
		mergeSortingMethod(numbers);
	}

	private static void mergeSortingMethod(int[] numbers) {
		long start = System.currentTimeMillis();
		mergeSorting(numbers);
		long end = System.currentTimeMillis();
		System.out.println("Sorting took: " + (end - start) + " ms");
	}

	private static void mergeSorting(int[] numbers) {
		if (numbers.length < 2) {
			return;
		}

		int[] rightArray = new int[numbers.length / 2];
		int[] leftArray = new int[numbers.length - (numbers.length / 2)];
		
		for (int i = 0; i < rightArray.length; i++) {
			rightArray[i] = numbers[i];
		}
		
		for (int i = rightArray.length, j = 0; j < leftArray.length; i++, j++) {
			leftArray[j] = numbers[i];
		}
		
		mergeSorting(rightArray);
		mergeSorting(leftArray);
		
		merge(numbers, rightArray, leftArray);
	}

	private static void merge(int[] numbers, int[] rightArray, int[] leftArray) {
		int rightIterator = 0;
		int leftIterator = 0;
		int numbersIterator = 0;
		
		while (rightArray.length > rightIterator && leftArray.length > leftIterator) {
			if (rightArray[rightIterator] < leftArray[leftIterator]) {
				numbers[numbersIterator++] = rightArray[rightIterator++];
			} else  {
				numbers[numbersIterator++] = leftArray[leftIterator++];
			}
			

		}
		
		while (rightArray.length > rightIterator) {
			numbers[numbersIterator++] = rightArray[rightIterator++];
		}
		
		while (leftArray.length > leftIterator) {
			numbers[numbersIterator++] = leftArray[leftIterator++];
		}
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
