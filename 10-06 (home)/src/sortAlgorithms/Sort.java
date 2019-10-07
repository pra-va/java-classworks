package sortAlgorithms;

import java.util.Arrays;
import java.util.Random;

/**
 * This is a test program made to learn sorting algorithms:
 * 1) bubble;
 * 2) insertion;
 * 3) selection;
 * 4) merge sort;
 * 5) quick sort.
 * 
 * Tasks:
 * 1) create 1kk long type array and fill it with random values;
 * 2) sort it using 5 earlier mentioned methods;
 * 3) measure time to decide which sorting algorithm is most efficient in this scenario.
 * @author pra-va
 *
 */
public class Sort {
	public static void main (String[] args) {
		startControllerMethod();
	}
	/**
	 * This method is used to create long array of 1kk members, fill them with random values,
	 * call sorting algorithm and measure sorting time.
	 */
	private static void startControllerMethod() {
		long[] longArray = new long[100000]; // 0.5kk, 0.1kk
		fillLongArray(longArray);
//		System.out.println(Arrays.toString(longArray));
		long start = System.currentTimeMillis();
		bubbleSort(longArray); // ... , 16833ms
//		insertionSort(longArray); // ... , 3051ms
//		selectionSort(longArray); // 36754ms, 1456ms
//		mergeSort(longArray); // 125ms , 28ms
//		quickSort(longArray, 0, longArray.length - 1); // 52ms , 12ms
		long end = System.currentTimeMillis();
//		System.out.println(Arrays.toString(longArray));
		System.out.println("Sorting took: " + (end - start) + " ms");
	}

	/**
	 * QuickSort algorithm.
	 * @param longArray
	 */
	private static void quickSort(long[] longArray, int start, int end) {
		if (start < end) {
			int pivot = pivotThis(longArray, start, end);
			
			quickSort(longArray, start, pivot - 1);
			quickSort(longArray, pivot + 1, end);
		}
		
	}
	
	private static int pivotThis(long[] longArray, int start, int end) {
		long pivotValue = longArray[end];
		int iterator = start - 1;
		for (int i = start; i < end; i++) {
			if (longArray[i] < pivotValue) { //longArray[i] and longArray[iterator]
				iterator++;
				long tmp = longArray[i];
				longArray[i] = longArray[iterator];
				longArray[iterator] = tmp;
			}
		}
		
		// iterator + 1 su pivot
		long tmp = longArray[iterator + 1];
		longArray[iterator + 1] = longArray[end];
		longArray[end] = tmp;
		
		return iterator + 1;
	}
	
	
	
	/**
	 * Merge sort algorithm, first part. Divide arrayList to small pieces.
	 * @param longArray
	 */
	private static void mergeSort(long[] longArray) {
		if (longArray.length < 2) {
			return;
		}
		
		int leftSideLength = longArray.length - (longArray.length / 2);
		int rightSideLength = longArray.length / 2;
		
		long[] leftArr = new long[leftSideLength];
		long[] rightArr = new long[rightSideLength];
		
		for (int i = 0; i < leftSideLength; i++) {
			leftArr[i] = longArray[i];
		}
		
		for (int i = leftSideLength, j = 0; i < longArray.length; i++, j++) {
			rightArr[j] = longArray[i];
		}
		
		mergeSort(leftArr);
		mergeSort(rightArr);
		
		merge(longArray, leftArr, rightArr);
		
	}
	
	/**
	 * Second (merge) part of merge sort algorithm.
	 * @param longArray
	 * @param leftArr
	 * @param rightArr
	 */
	private static void merge(long[] longArray, long[] leftArr, long[] rightArr) {
		int leftArrayIterator = 0;
		int rightArrayIterator = 0;
		int mainArrayIterator = 0;
		
		while(leftArrayIterator < leftArr.length && rightArrayIterator < rightArr.length) {
			if (leftArr[leftArrayIterator] < rightArr[rightArrayIterator]) {
				longArray[mainArrayIterator] = leftArr[leftArrayIterator];
				leftArrayIterator++;
				mainArrayIterator++;
			} else {
				longArray[mainArrayIterator] = rightArr[rightArrayIterator];
				rightArrayIterator++;
				mainArrayIterator++;
			}
		}
		
		while (leftArrayIterator < leftArr.length) {
			longArray[mainArrayIterator] = leftArr[leftArrayIterator];
			leftArrayIterator++;
			mainArrayIterator++;
		}
		
		while (rightArrayIterator < rightArr.length) {
			longArray[mainArrayIterator] = rightArr[rightArrayIterator];
			mainArrayIterator++;
			rightArrayIterator++;
		}
	}
	
	/**
	 * Selection sort algorithm.
	 * @param longArray
	 */
	private static void selectionSort(long[] longArray) {
		for (int i = 0; i < longArray.length; i++) {
			long smallestMember = longArray[i];
			int smallestMemberIndex = i;
			for (int j = i; j < longArray.length; j++) {
				if (longArray[j] < smallestMember) {
					smallestMember = longArray[j];
					smallestMemberIndex = j;
				}
			}
			if (smallestMemberIndex != i) {
				longArray[smallestMemberIndex] = longArray[i];
				longArray[i] = smallestMember;
			} else {
				continue;
			}
		}
	}
	
	/**
	 * Insertion sort algorithm.
	 * @param longArray
	 */
	private static void insertionSort(long[] longArray) {
		for (int i = 1; i < longArray.length; i++) {
			long tmpValue = longArray[i];
			int iterator = i - 1;
			while (iterator >= 0 && longArray[iterator] > tmpValue) {
				longArray[iterator + 1] = longArray[iterator];
				longArray[iterator] = tmpValue;
				iterator--;
			}
		}
	}
	
	/**
	 * Bubble sort algorithm.
	 * @param longArray
	 */
	private static void bubbleSort(long[] longArray) {
		int numberOfSwaps = 1;
		while(numberOfSwaps > 0) {
			numberOfSwaps = 0;
			for(int i = 0, j = 1; j < longArray.length; i++, j++) {
				if (longArray[i] > longArray[j]) {
					long tmp = longArray[j];
					longArray[j] = longArray[i];
					longArray[i] = tmp;
					numberOfSwaps++;
				}
			}
		}
		
	}
	
	/**
	 * Creates long type array
	 * @param longArray
	 */
	private static void fillLongArray(long[] longArray) {
		Random random = new Random();
		for (int i = 0; i < longArray.length; i++) {
			longArray[i] = random.nextInt(); // revert this back to long
		}
		
	}
	
	
}











