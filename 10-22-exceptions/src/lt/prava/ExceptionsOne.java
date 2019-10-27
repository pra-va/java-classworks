package lt.prava;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionsOne {
	public static void main(String[] args) {
		runner();
		readFromFile();
	}

	public static void runner() {
		try {
			Scanner input = new Scanner(System.in);
			int number = input.nextInt();
			System.out.println("Program works...");
		} catch (InputMismatchException e) {
			System.out.println("Wrong number type.");
		}

	}

	public static void readFromFile() {
		try {
			File file = new File("test.txt");
			Scanner scanner = new Scanner(file);
		} catch (FileNotFoundException e) {
			System.out.println("Not such file.");
		}
	}
}
