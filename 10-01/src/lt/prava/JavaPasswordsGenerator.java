package lt.prava;

import java.util.Arrays;
import java.util.Random;

public class JavaPasswordsGenerator {

	public static void main(String[] args) {
		String[] passwordList = createPasswordList(100000000, 8); // Number of passwords, number of symbols
		sortList(passwordList);
//		printFromArray(0, 3, passwordList); // print passwordList elements ([from], [to], passwordList)
		System.out.println("Password dublicates found: " + checkIfItemsMatches(passwordList));

	}

	private static int checkIfItemsMatches(String[] passwordList) {
		long generateStart = System.currentTimeMillis();
		String first = "";
		String second = "";
		int passwordMatches = 0;
		for (int i = 0, j = 1; j < passwordList.length; i++, j++) {
			first = passwordList[i];
			second = passwordList[j];
			if (first.equals(second)) {
				passwordMatches++;
			}
		}
		long generateEnd = System.currentTimeMillis();
		System.out.println("Checking for dublicate passwords took " + (generateEnd - generateStart) + " ms");
		return passwordMatches;
	}

	private static void printFromArray(int start, int end, String[] passwordsArray) {
		for (int i = start; i < end + 1; i++) {
			System.out.println(passwordsArray[i]);
		}
	}

	private static String[] sortList(String[] passwordList) {
		long generateStart = System.currentTimeMillis();
		Arrays.sort(passwordList);
		long generateEnd = System.currentTimeMillis();
		System.out.println("Sorting passwords took " + (generateEnd - generateStart) + " ms");
		return passwordList;
	}

	private static String[] createPasswordList(int numberOfPasswords, int lengthOfPassword) {
		long generateStart = System.currentTimeMillis();
		String[] passwordArray = new String[numberOfPasswords];
		for (int i = 0; i < passwordArray.length; i++) {
			passwordArray[i] = generateRandomPassword(lengthOfPassword);
		}
		long generateEnd = System.currentTimeMillis();
		System.out.println("Generating passwords took " + (generateEnd - generateStart) + " ms");
		return passwordArray;
	}

	private static String generateRandomPassword(int lenght) {
		StringBuilder builder = new StringBuilder();
		Random ranodm = new Random();
		char[] charArray = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*-_+/.,;\"][{}|\\"
				.toCharArray();
		for (int i = 0; i < lenght; i++) {
			builder.append(charArray[ranodm.nextInt(charArray.length - 1)]);
		}
		return builder.toString();
	}

}
