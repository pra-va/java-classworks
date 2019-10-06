// Koks maksimalus masyvo dydis??
// NAMIE OPTIMIZUOTI

package lt.prava;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class JavaArraysAlgorithms {
	private static int[] numbers = new int[10000000];

	public static void main(String[] args) {
//		System.out.println(numbers);
//		System.out.println(Arrays.toString(numbers));

		// 20 elementu masyvas
		// atsitiktiniai sk iki 100
		// metodas skaiciuos operaciju su masyvu laika

		numbers = fillArrayWithRandomNumbers(numbers);
//		printArray(numbers);
		String operation = "prime"; // copyArray = copy, reverseArray = reverse, shuffleArray = shuffle, primeNumberArray = prime
		countTime(operation);
	}

	private static void printArray(int[] numbers) {
		for (int number : numbers) {
			System.out.print(number + " ");
		}
		System.out.println();
	}

	private static void countTime(String operation) {
		long start = System.currentTimeMillis();
		switch (operation) {
		case "copy":
			copyArray(numbers);
			printArray(numbers);
			break;
		case "reverse" :
			reverseArray(numbers);
			printArray(numbers);
			break;
		case "shuffle":
			shuffleArray(numbers);
			printArray(numbers);
			break;
		case "prime":
			prime(numbers);
//			printArray(numbers);
			break;
		default:
			System.out.println("...");
		}
		long end = System.currentTimeMillis();
		System.out.println("Time for " + operation + ": " + (end - start) + " ms");
	}
	
// NAMIE OPTIMIZUOTI
	
//	private static void prime(int[] numbers) {
//		int[] temp = new int[numbers.length];
//		boolean divides = false;
//		for (int i = 0; i < numbers.length; i++) {
//			divides = false;
//			if (numbers[i] % 2 == 0 || numbers[i] % 3 == 0 || numbers[i] % 5 == 0 || numbers[i] % 7 == 0) {
//				continue;
//			}
//			for (int j = 2; j < numbers[i]; j++) {
//				if (numbers[i] % j == 0) {
//					divides = true;
//					break;
//				}
//			}
//			if (divides) {
//				temp[i] = numbers[i];
//			}
//		}
//	}
	
	private static void prime(int[] numbers) {
		int[] temp = new int[numbers.length];
		int primeCounter = 0;
		for (int i = 0; i < temp.length; i++) {
			if (isPrimeNumber(numbers[i])) {
				temp[primeCounter] = numbers[i];
				primeCounter++;
			}
		}
		int[] primeNumbers = new int[primeCounter];
		for (int i = 0; i < primeNumbers.length; i++) {
			primeNumbers[i] = temp[i];
		}
	}
	

	private static boolean isPrimeNumber(int number) {
		if (number < 2) {
			return false;
		}
		for (int i = 2; i < number; i++) {
			if (number % i ==0) {
				return false;
			}
		}
		return true;
	}

	private static void shuffleArray(int[] numbers) {
		int tmp = 0, randomIndex = 0;
		for (int i = 0; i < numbers.length; i++) {
			randomIndex = (int) (Math.random() * numbers.length);
			if (i == randomIndex) {
				continue;
			}
			tmp = numbers[i];
			numbers[i] = numbers[randomIndex];
			numbers[randomIndex] = tmp;
		}
	}

	private static void reverseArray(int[] numbers) {
		int tmp = 0;
		for (int i = 0, j = numbers.length - 1; i < j; i++, j--) {
			tmp = numbers[i];
			numbers[i] = numbers[j];
			numbers[j] = tmp;
		}
		System.out.println();
	}

	private static int[] copyArray(int[] numbers) {
		int[] copyNumbers = new int[numbers.length];
		for (int i = 0; i < copyNumbers.length; i++) {
			copyNumbers[i] = numbers[i];
		}
//		System.out.println(numbers);
//		System.out.println(copyNumbers);
		System.out.println(Arrays.equals(numbers, copyNumbers));
		return copyNumbers;
	}

	private static int[] fillArrayWithRandomNumbers(int[] numbers) {
		Random random = new Random();
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = random.nextInt(100);
		}
		return numbers;
	}
}








