package lt.prava;

import java.util.Arrays;
import java.util.Random;

public class SortingAlgorithmDoubles {
	private static double[] numbers = new double[20];

	public static void main(String[] args) {
		generateDoubles(numbers);
		System.out.println(Arrays.toString(numbers));
//		bubbleSort(numbers);
//		insertionSort(numbers);
//		selectionSort(numbers);
//		mergeSort(numbers);
		quickSort(numbers, 0, numbers.length - 1);
		System.out.println(Arrays.toString(numbers));
	}
	
	
	

	private static void quickSort(double[] numbers, int start, int end) {
		if (start < end) {
			int pivot = partition(numbers, start, end);
			quickSort(numbers, start, pivot - 1);
			quickSort(numbers, pivot + 1, end);
		}
	}




	private static int partition(double[] numbers, int start, int end) {
		double pivot = numbers[end];
		int iterator = start - 1;
		for (int i = start; i < end; i++) {
			if (numbers[i] < pivot) {
				iterator++;
				double temp = numbers[i];
				numbers[i] = numbers[iterator];
				numbers[iterator] = temp;
			}
		}
		
		double tmp = numbers[end];
		numbers[end] = numbers[iterator + 1];
		numbers[iterator + 1] = tmp;
		
		return iterator + 1;
	}




	private static void mergeSort(double[] numbers) {
		if (numbers.length < 2) {
			return;
		}
		
		double[] right = new double[numbers.length / 2];
		double[] left = new double[numbers.length - (numbers.length / 2)];
		
		for (int i = 0; i < right.length; i++) {
			right[i] = numbers[i];
		}
		for (int i = right.length, j = 0; j < left.length; i++, j++) {
			left[j] = numbers[i];
		}
		
		mergeSort(right);
		mergeSort(left);
		
		merge(numbers, right, left);
	}




	private static void merge(double[] numbers, double[] right, double[] left) {
		int numbersIterator = 0;
		int rightIterator = 0;
		int leftIterator = 0;
		
		while(rightIterator < right.length && leftIterator < left.length) {
			if (right[rightIterator] < left[leftIterator]) {
				numbers[numbersIterator++] = right[rightIterator++];
			} else {
				numbers[numbersIterator++] = left[leftIterator++];
			}
		}
		
		while (rightIterator < right.length) {
			numbers[numbersIterator++] = right[rightIterator++];
		}
		
		while (leftIterator < left.length) {
			numbers[numbersIterator++] = left[leftIterator++];
		}
	}




	private static void selectionSort(double[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			double smallestMember = numbers[i];
			int smallestIndex = i;
			for (int j = i; j < numbers.length; j++) {
				if (numbers[j] < smallestMember) {
					smallestMember = numbers[j];
					smallestIndex = j;
				}
			}
			if (smallestIndex != i) {
				double tmp = numbers[i];
				numbers[i] = numbers[smallestIndex];
				numbers[smallestIndex] = tmp;
			}
		}
	}



	private static void insertionSort(double[] numbers) {
		for (int i = 1; i < numbers.length; i++) {
			for (int j = i; j > 0; j--) {
				if (numbers[j] < numbers[j - 1]) {
					double tmp = numbers[j];
					numbers[j] = numbers[j - 1];
					numbers[j - 1] = tmp;
				} else {
					break;
				}
			}
		}
	}



	private static void bubbleSort(double[] numbers) {
		int numberOfSwaps = 1;
		while (numberOfSwaps > 0) {
			numberOfSwaps = 0;
			for (int i = 0, j = 1; j < numbers.length; i++, j++) {
				if (numbers[i] > numbers[j]) {
					double tmp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = tmp;
					numberOfSwaps++;
				}
			}
		}
	}

	private static void generateDoubles(double[] numbers) {
		Random random = new Random();
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = random.nextDouble();
		}
	}

}
