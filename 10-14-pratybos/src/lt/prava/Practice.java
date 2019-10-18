package lt.prava;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Practice {

	public static void main(String[] a) {
//		printText(); // 1.

//		char[] text = { 'H', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd' };
//		System.out.println(changeCharArrayToString(text)); // 2.

//		char[] data = { 'p', 'r', 'o', 'g', 'r', 'a', 'm', 'm', 'i', 'n', 'g' }; // 3.
//		printTwoWays(data);

//		char[] data = { 'p', 'r', 'o', 'g', 'r', 'a', 'm', 'm', 'i', 'n', 'g' }; // 4.
//		System.out.println(changeCharArrayToString(data));
//		System.out.println(reverseArray(data));

//		String given = ").cte ,iP yrrebpsaR ,xuniL ,caM ,swodniW( smroftalp tnereffid no skrow avaJ"; // 5.
//		System.out.println(reverseString(given));

//		printXorTable(); // 6.

//		printIsTable(); // 7.

//		printPrimitiveMinMaxValues(); // 8.

		String text = "String changer.";
		stringToBinaryForm(text); // 9.

//		String code = "84, 104, 101, 32, 98, 101, 115, 116, 32, 112, 97, 115, 115, 119, "
//				+ "111, 114, 100, 32, 109, 97, 110, 97, 103, 101, 114, 115, 32, 102, 111, 114, 32, 50, 48, 49, 57";
//		decodeText(code); // 10.

//		squareVolumeAndPerimeter(); // 11.

//		findFocus(); // 12.

//		getNameGender("pranas"); // 13.

//		getWeekDay("2019-10-17"); // 14.

//		printAllFibonacciLessThan(1000); // 15.

//		addNumbersUp(); // 16.

//		squaresNumber(); // 17.

//		isWordPalyndromic("annas"); // 18.

//		printMultiplicationTable(100); // 19.

//		factorial(); // 20.

	}

	private static void factorial() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number: ");
		int number = scanner.nextInt();
		for (int i = number - 1; i > 0; i--) {
			number *= i;
		}
		System.out.println(number);
	}

	private static void printMultiplicationTable(int maxNumber) {
		for (int i = 1; i <= maxNumber; i++) {
			for (int j = 1; j <= maxNumber; j++) {
				System.out.printf("%6s", i * j);
			}
			System.out.print("\n");
		}
	}

	private static void isWordPalyndromic(String wordToCheck) {
		for (int i = 0, j = wordToCheck.length() - 1; i < wordToCheck.length() / 2; i++, j--) {
			if (wordToCheck.charAt(i) == wordToCheck.charAt(j)) {
				continue;
			} else {
				System.out.println("Word " + wordToCheck + " is not palindromic.");
				return;
			}
		}
		System.out.println("Word " + wordToCheck + " is palindromic.");

	}

	private static void squaresNumber() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("What number to square?");
		int number = scanner.nextInt();

		int answer = 0;

		for (int i = 0; i < number; i++) {
			for (int j = 0; j < number; j++) {
				answer++;
			}
		}

		System.out.println(answer);
	}

	private static void addNumbersUp() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter first number: ");
		int first = scanner.nextInt();

		System.out.println("Enter second number: ");
		int second = scanner.nextInt();

		for (int i = 0; i < second; i++) {
			first++;
		}

		System.out.println(first);
	}

	private static void printAllFibonacciLessThan(int maxNumber) {
		for (int i = 1; i < maxNumber; i++) {
			boolean dividesFromSelf = false;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					dividesFromSelf = true;
					break;
				}
			}
			if (!dividesFromSelf) {
				System.out.println(i);
			}
		}
	}

	// Parameter format: yyyy-mm-dd
	private static void getWeekDay(String date) {
		String[] stringDateArray = date.split("-");
		int[] dateArrayFormatted = new int[3];

		dateArrayFormatted[0] = Integer.parseInt(stringDateArray[0]) - 1900;
		dateArrayFormatted[1] = Integer.parseInt(stringDateArray[1]) - 1;
		dateArrayFormatted[2] = Integer.parseInt(stringDateArray[2]);

		System.out.println(new SimpleDateFormat("EEEE")
				.format(new Date(dateArrayFormatted[0], dateArrayFormatted[1], dateArrayFormatted[2])));
	}

	private static void getNameGender(String name) {
		StringBuilder builder = new StringBuilder();
		for (int i = name.length() - 1; i >= name.length() - 2; i--) {
			builder.append(name.charAt(i));
		}
		if (builder.toString().equals("sa") || builder.toString().equals("su")) {
			System.out.println(name + " is a man.");
		} else {
			System.out.println(name + " is a woman.");
		}

	}

	private static void findFocus() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a: ");
		double a = scanner.nextDouble();
		System.out.println("Enter b: ");
		double b = scanner.nextDouble();
		System.out.println("Enter c: ");
		double c = scanner.nextDouble();

		System.out.println("Focus x = " + (-b / (2 * a)));
		System.out.println("Focus y = " + (c - (b * 2 - 1) / (4 * a)));
	}

	private static void squareVolumeAndPerimeter() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter cube side length:");
		double side = scanner.nextDouble();
		System.out.println("Volume: " + (side * side));
		System.out.println("Perimeter: " + (side * 4));
	}

	private static void decodeText(String code) {
		String[] stringArray = code.split(", ");
		for (int i = 0; i < stringArray.length; i++) {
			char intChar = (char) Integer.parseInt(stringArray[i]);
			System.out.print(intChar);
		}

	}

	private static void stringToBinaryForm(String text) {
		byte[] bytes = text.getBytes();
		System.out.println(Arrays.toString(bytes));
		StringBuilder binary = new StringBuilder();
		for (byte b : bytes) {
			int val = b;
			for (int i = 0; i < 8; i++) {
				System.out.println(val);
				binary.append((val & 128) == 0 ? 0 : 1);
				val <<= 1;
			}
			binary.append(' ');
		}
		System.out.println("'" + text + "' to binary: " + binary);
	}

	private static void printPrimitiveMinMaxValues() {
		System.out.println("Byte: " + Byte.MIN_VALUE + " - " + Byte.MAX_VALUE);
		System.out.println("Short: " + Short.MIN_VALUE + " - " + Short.MAX_VALUE);
		System.out.println("Integer: " + Integer.MIN_VALUE + " - " + Integer.MAX_VALUE);
		System.out.println("Long: " + Long.MIN_VALUE + " - " + Long.MAX_VALUE);

	}

	private static void printIsTable() {
		String str = "A\240b3&4\040";
		char[] strToArray = str.toCharArray();

		System.out.println("Chars: " + changeCharArrayToString(strToArray));
		System.out.printf("%20s", "Chars:");
		for (int i = 0; i < strToArray.length; i++) {
			printFormatedSameLine(strToArray[i]);
		}

		System.out.printf("\n%20s", "Char code:");
		for (int i = 0; i < strToArray.length; i++) {
			int charCode = strToArray[i];
			printFormatedSameLine(charCode);
		}

		System.out.printf("\n%20s", "isDigit()");
		for (int i = 0; i < strToArray.length; i++) {
			boolean isDigit = Character.isDigit(strToArray[i]);
			String isDigitString = String.valueOf(isDigit).toString();
			printFormatedSameLineStr(isDigitString);
		}

		System.out.printf("\n%20s", "isLetter()");
		for (int i = 0; i < strToArray.length; i++) {
			boolean isLetter = Character.isLetter(strToArray[i]);
			String isDigitString = String.valueOf(isLetter).toString();
			printFormatedSameLineStr(isDigitString);
		}

		System.out.printf("\n%20s", "isDigitOrLetter()");
		for (int i = 0; i < strToArray.length; i++) {
			boolean is = (Character.isDigit(strToArray[i]) || Character.isLetter(strToArray[i]));
			String isString = String.valueOf(is).toString();
			printFormatedSameLineStr(isString);
		}

		System.out.printf("\n%20s", "isLowerCase()");
		for (int i = 0; i < strToArray.length; i++) {
			boolean is = Character.isLowerCase(strToArray[i]);
			String isString = String.valueOf(is).toString();
			printFormatedSameLineStr(isString);
		}

		System.out.printf("\n%20s", "isSpaceChar()");
		for (int i = 0; i < strToArray.length; i++) {
			String charAtI = String.valueOf(strToArray[i]).toString();
			if (charAtI.equals("\240") || charAtI.equals("\040")) {
				printFormatedSameLineStr("true");
			} else {
				printFormatedSameLineStr("false");
			}
		}

		System.out.printf("\n%20s", "isUpperCase()");
		for (int i = 0; i < strToArray.length; i++) {
			boolean is = Character.isUpperCase(strToArray[i]);
			String isString = String.valueOf(is).toString();
			printFormatedSameLineStr(isString);
		}

		System.out.printf("\n%20s", "isWhiteSpace()");
		for (int i = 0; i < strToArray.length; i++) {
			String charAtI = String.valueOf(strToArray[i]).toString();
			if (charAtI.equals("\040")) {
				printFormatedSameLineStr("true");
			} else {
				printFormatedSameLineStr("false");
			}
		}
	}

	private static void printFormatedSameLine(int character) {
		System.out.printf("%6s", character);
	}

	private static void printFormatedSameLineStr(String character) {
		System.out.printf("%6s", character);
	}

	private static void printFormatedSameLine(char character) {
		System.out.printf("%6s", character);
	}

	private static void printXorTable() {
		System.out.println("XOR truth table:");
		System.out.printf("%5s + %5s = %5s", "a", "b", "a^b");
		boolean a = false;
		boolean b = false;
		System.out.printf("\n%5s + %5s = %5s", a, b, a ^ b);
		a = false;
		b = true;
		System.out.printf("\n%5s + %5s = %5s", a, b, a ^ b);
		a = true;
		b = false;
		System.out.printf("\n%5s + %5s = %5s", a, b, a ^ b);
		a = true;
		b = true;
		System.out.printf("\n%5s + %5s = %5s", a, b, a ^ b);
	}

	private static String reverseString(String given) {
		String reversedString = "";
		for (int i = given.length() - 1; i >= 0; i--) {
			reversedString += given.charAt(i);
		}
		return reversedString;
	}

	private static String reverseArray(char[] data) {
		String reversed = "";
		for (int i = data.length - 1; i >= 0; i--) {
			reversed += data[i];
		}
		return reversed;
	}

	private static void printTwoWays(char[] data) {
		System.out.println(changeCharArrayToString(data).toLowerCase());
		System.out.println(changeCharArrayToString(data).toUpperCase());

	}

	private static String changeCharArrayToString(char[] text) {
		String textString = "";
		for (int i = 0; i < text.length; i++) {
			textString += text[i];
		}
		return textString;

	}

	private static void printText() {
		System.out.println("*******************Programming*******************");
		System.out.println("* Java is a popular programming language, created in 1995 *");
		System.out.println("*************************************************");
	}

}
