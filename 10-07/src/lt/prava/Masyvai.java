package lt.prava;

import java.util.Random;

public class Masyvai {
	private static int[] numbers = new int[500000000];
	public static void main(String[] args) {
		int value = 15;
		fillArray(numbers);
		System.out.println(numbers.length);
		System.out.println(removesElements(numbers, value).length);
//		printArray(numbers);
//		printArray(removesElements(numbers, value));

	}

	private static int[] removesElements(int numbers[], int value) {
		long start = System.currentTimeMillis();
		int count = 0;
		for (int number : numbers) {
			if (number != value) {
				count++;
			}
		}
		int[] newNumbers = new int[count];
		int iterator = 0;
		for (int i = 0; i < newNumbers.length; i++) {
			if (numbers[i] == value) {
				continue;
			} else {
				newNumbers[iterator] = numbers[i];
				iterator++;
			}
		}
		long end = System.currentTimeMillis();
		System.out.println("Members removed in: " + (end - start) + "ms");
		return newNumbers;
	}
	
	private static void fillArray(int[] numbers) {
		Random random = new Random();
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = random.nextInt(100);
		}
		
	}
	
	private static void printArray(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
	}

}


















