package lt.prava;

import java.util.Arrays;
import java.util.Random;

public class Practice {
	public static void main(String[] args) {
		// 1.
//		generateSquareSigns();

		// 2.
//		generateOtherSquareSigns();

		// 3.
//		generateSignsWindow();

		// 4.
//		printsSignsTriagnle();

		// 5.
//		printsNotSteepTriangle();

		// 6.
//		calculateAreaAndPerimeter(10, 20);

		// 7.
//		printPi();

		// 8.
//		calculateObjectMass(9.81, 82);

		// 9.
//		fahrengeitToCelcius(100.0);

//		10.
//		randomArray();

		// 11.
//		calculateArea(2.23);

		// 12.
		String[] names = { "Pranas", "Tomas", "Gintare", "Gintare", "Jone", "Ramunas" };
//		sortStringArray(names);

		// 13.
//		removeDublicates();

		// 14.
//		largestStringFromArray(names);

		// 16.
		calculateSquareEquation(5.0, 2.0, 10.2);

	}

	private static void calculateSquareEquation(double a, double b, double c) {
		if (a == 0 || b == 0 || c == 0) {
			System.out.println("Invalid equation form.");
			return;
		}

	}

	private static void largestStringFromArray(String[] names) {
		int longestIndex = -1;
		int longestLength = -1;

		for (int i = 0; i < names.length; i++) {
			if (names[i].length() > longestLength) {
				longestLength = names[i].length();
				longestIndex = i;
			}
		}

		if (longestIndex != -1) {
			System.out.println("Longest member is: " + names[longestIndex]);
		}

	}

	private static void removeDublicates() {
		int[] numbers = new int[20];
		Random random = new Random();

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = random.nextInt(10);
		}

		System.out.println(Arrays.toString(numbers));
		int counter = 0;

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == -1) {
				continue;
			}
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[j] == -1) {
					continue;
				}
				if (numbers[i] == numbers[j]) {
					numbers[j] = -1;
					counter++;
				}
			}
		}

		int[] newNumbers = new int[numbers.length - counter];
		for (int i = 0, j = 0; i < numbers.length; i++) {
			if (numbers[i] != -1) {
				newNumbers[j] = numbers[i];
				j++;
			}
		}

		System.out.println(Arrays.toString(newNumbers));

	}

	private static void sortStringArray(String[] names) {
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));

	}

	// Circle
	private static void calculateArea(double radius) {
		System.out.println("Circle area: " + Math.PI * Math.pow(radius, 2));
	}

	// Square
	private static void calculateArea(double sideOne, double sideTwo) {
		System.out.println("Square area: " + sideOne * sideTwo);
	}

	private static void randomArray() {
		int[] numbers = new int[20];
		Random random = new Random();
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = random.nextInt();
		}
		System.out.println(Arrays.toString(numbers));
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		System.out.println("Sum: " + sum);
	}

	private static void fahrengeitToCelcius(double tempFahr) {
		System.out.println(Math.round(((tempFahr - 32.0) * (5.0 / 9.0)) * 100.0) / 100.0);

	}

	private static void calculateObjectMass(double freeFallAcceleration, int objectMass) {
		System.out.println("Weight " + freeFallAcceleration * objectMass);

	}

	private static void printPi() {
		double formatNumber = 1E12;
		System.out.println(Math.round(Math.PI * formatNumber) / formatNumber);

	}

	private static void calculateAreaAndPerimeter(int numberOne, int numberTwo) {
		try {
			System.out.println("Area: " + numberOne * numberTwo);
			System.out.println("Perimeter " + ((numberOne * 2) + (numberTwo * 2)));
		} catch (NumberFormatException e) {
			System.out.println("Invalid number format.");
		}

	}

	private static void printsNotSteepTriangle() {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 9; j++) {
				if (i == 3) {
					System.out.print("* ");
					continue;
				}
				if (i == 0 && j == 4) {
					System.out.print("* ");
					continue;
				}
				if (i == 1 && (j == 3 || j == 5)) {
					System.out.print("* ");
					continue;
				}
				if (i == 2 && (j == 1 || j == 6)) {
					System.out.print(" *");
					continue;
				}

				System.out.print("  ");
			}
			System.out.println("");
		}
	}

	private static void printsSignsTriagnle() {
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 8; j++) {
				if (j == 0 && i != 5) {
					System.out.print("* ");
					continue;
				}
				if (i == 5) {
					System.out.print("* ");
					continue;
				}
				if (i == 1 && j == 1) {
					System.out.print("* ");
					continue;
				}
				if (i == 2 && j == 2) {
					System.out.print(" *");
					continue;
				}
				if (i == 3 && j == 4) {
					System.out.print("* ");
					continue;
				}
				if (i == 4 && j == 5) {
					System.out.print(" *");
					continue;
				}
				System.out.print("  ");
			}
			System.out.println("");
		}
	}

	private static void generateSignsWindow() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == 0 || i == 3) {
					System.out.print("* ");
				} else if (i == 1 || i == 2) {
					if (j == 0 || j == 4) {
						System.out.print("* ");
					} else {
						System.out.print("  ");
					}
				}
			}
			System.out.println("");
		}

	}

	private static void generateOtherSquareSigns() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}

	}

	private static void generateSquareSigns() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
}
