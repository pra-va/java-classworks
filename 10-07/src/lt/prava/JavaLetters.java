package lt.prava;

import java.util.Arrays;

public class JavaLetters {

	public static void main(String[] args) {
		// Gauname
		String text = "ffafsjkjlmnlibgfggfklmlkmacsknsjbnslnaqweoijrj";
		
		// Rasti kiek skirtingu raidziu
		
		countLetters(text);
	}

	private static void countLetters(String text) {
		text.toLowerCase();
		char[] letters = new char[26];
		int[] numberOfLetters = new int[26];
	
		
		
		int letterIterator = 0;
		for (int i = 0; i < text.length(); i++) {
			char checkingChar = text.charAt(i);
			boolean lettersArrayContains = false;
			for (int j = 0; j < letters.length; j++) {
				if (letters[j] == checkingChar) {
					lettersArrayContains = true;
					break;
				}
			}
			if (!lettersArrayContains) {
				letters[letterIterator] = text.charAt(i);
				letterIterator++;
			}
		}
		
		for (int i = 0; i < letters.length; i++) {
			for (int j = 0; j < text.length(); j++) {
				if (letters[i] == text.charAt(j)) {
					numberOfLetters[i]++;
				}
			}
		}
		
		for (int i = 0; i < numberOfLetters.length; i++) {
			System.out.println("Letter: " + letters[i] + " appears: " + numberOfLetters[i] + " times.");
		}
		
	}

}
















