package lt.prava;

public class Practice {

	public static void main(String[] args) {
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

//		String text = "String changer.";
//		stringToBinaryForm(text); // 9.

		String code = "84, 104, 101, 32, 98, 101, 115, 116, 32, 112, 97, 115, 115, 119, "
				+ "111, 114, 100, 32, 109, 97, 110, 97, 103, 101, 114, 115, 32, 102, 111, 114, 32, 50, 48, 49, 57";
		decodeText(code);

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
		StringBuilder binary = new StringBuilder();
		for (byte b : bytes) {
			int val = b;
			for (int i = 0; i < 8; i++) {
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
