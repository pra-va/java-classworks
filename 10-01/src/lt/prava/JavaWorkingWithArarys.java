package lt.prava;

import java.util.Arrays;
import java.util.Random;

public class JavaWorkingWithArarys {

	public static void main(String[] args) {
		int[] numbers = new int[10]; // destination 
		int[] otherNumbers = new int[5]; // source
		fillArray(numbers);
		fillArray(otherNumbers);
		int index = 99999;
		int value = 45;
		int[] arrayWithRandoms = insertElementByIndexRandom(numbers, otherNumbers);
		printArray(arrayWithRandoms);
		System.out.println("Length = " + arrayWithRandoms.length);
	}	

	private static int[] insertElementByIndexRandom(int[] numbers, int[] otherNumbers) {
		int[] newNumbers = new int[numbers.length + otherNumbers.length];
		newNumbers = numbers;
		Random random = new Random();
		int randomIndex = 0;
		for(int i = 0; i < otherNumbers.length; i++) {
			randomIndex = random.nextInt(newNumbers.length);
			newNumbers = insertElementByIndex(newNumbers, randomIndex, otherNumbers[i]);
		}
		return newNumbers;
	}

	private static int[] fillArray(int[] numbers) {
		long start = System.currentTimeMillis();
		Random random = new Random();
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = random.nextInt(1000);
		}
		long end = System.currentTimeMillis();
		return numbers;
	}

	private static int[] insertElementByIndex(int[] numbers, int index, int value) {
		long start = System.currentTimeMillis();
		int[] newNumbers = new int[numbers.length + 1];
		if (index < numbers.length) {
			for (int i = 0; i < index; i++) {
				newNumbers[i] = numbers[i];
				// Sugalvoti, kaip optimizuoti.
			}
			newNumbers[index] = value;
			for (int i = index + 1; i < newNumbers.length; i++) {
				newNumbers[i] = numbers[i - 1];
			}
		}
		long end = System.currentTimeMillis();
		return newNumbers;
	}

	private static void printArray(int[] numbers) {
		for (int number : numbers) {
			System.out.print(number + " ");
		}
		System.out.println();
	}

}
