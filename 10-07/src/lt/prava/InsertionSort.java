/**
 * Unsorted. 100000 random members - 5560ms;
 * Sorted. 100000 random members - 1410ms;
 * Same 100000 values - 1383ms.
 * 
 */

package lt.prava;

import java.util.Arrays;
import java.util.Random;

public class InsertionSort {
	private static int[] numbers = new int[100000];
	
	public static void main(String[] args) {
		fillArray(numbers);
//		Arrays.sort(numbers);
		insertionSorting(numbers);
//		printArray(numbers);


	}

	private static void printArray(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}

	private static void insertionSorting(int[] numbers) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i; j > 0; j--) {
				if (numbers[j] < numbers[j - 1]) {
					numbers[j] = numbers[j] ^ numbers[j - 1];
					numbers[j - 1] = numbers[j] ^ numbers[j - 1];
					numbers[j] = numbers[j] ^ numbers[j - 1];
				}
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
	

}
